package by.tc.task02.dao.xmltaghandler;

import by.tc.task02.entity.AbstractTag;

import java.util.Stack;
import java.util.regex.Matcher;

public class CloseTagHandler implements ITagHandler {

    private static final int TAG_NAME_MATCHER_GROUP_NUMBER = 1;

    private Stack<AbstractTag> stack;
    private Matcher matcher;

    public CloseTagHandler(Stack<AbstractTag> stack, Matcher matcher) {
        this.stack = stack;
        this.matcher = matcher;
    }

    @Override
    public void handle() {
        if (matcher.find()) {
            String tagName = matcher.group(TAG_NAME_MATCHER_GROUP_NUMBER);
            if (tagName.equals(stack.peek().getName())) {
                if(stack.size() > 1) {
                    stack.pop();
                }
            } else {
                throw new RuntimeException("Error!");
            }
        }
    }

}
