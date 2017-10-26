package by.tc.task02.dao;

import by.tc.task02.dao.xmltaghandler.CloseTagHandler;
import by.tc.task02.dao.xmltaghandler.ContentTagHandler;
import by.tc.task02.dao.xmltaghandler.ITagHandler;
import by.tc.task02.dao.xmltaghandler.OpenTagHandler;
import by.tc.task02.entity.AbstractTag;

import java.util.Stack;
import java.util.regex.Pattern;

public class ParserXMLFactory {

    private String openTagRegex = "<([A-Za-z_0-9-]+)(\\s+.+)*>";
    private String closeTagRegex = "</([A-Za-z_0-9-]+)>";
    private String contentTagRegex = openTagRegex + "(.*)" + closeTagRegex;
    private Pattern openTagPattern = Pattern.compile(openTagRegex);
    private Pattern closeTagPattern = Pattern.compile(closeTagRegex);
    private Pattern contentTagPattern = Pattern.compile(contentTagRegex);

    public ITagHandler getHandler(Stack<AbstractTag> stack, String line) {
        if(Pattern.matches(openTagRegex, line)) {
            return new OpenTagHandler(stack, openTagPattern.matcher(line));
        } else if (Pattern.matches(closeTagRegex, line)) {
            return new CloseTagHandler(stack, closeTagPattern.matcher(line));
        } else if (Pattern.matches(contentTagRegex, line)) {
            return new ContentTagHandler(stack, contentTagPattern.matcher(line));
        } else {
            throw new RuntimeException("Error!");
        }
    }

}
