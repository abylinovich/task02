package by.tc.task02.dao;

import by.tc.task02.entity.TagXML;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParserXMLFileDAO implements IParserXMLDAO {

    @Override
    public TagXML parseXML(String path) {
        Stack<TagXML> stack = new Stack<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(path)))) {
            ParserXMLProcessor processor = new ParserXMLProcessor();
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                processor.process(stack, line);
            }
            if(stack.size() == 1) {
                return stack.pop();
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

}
