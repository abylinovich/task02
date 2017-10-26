package by.tc.task02.dao;

import by.tc.task02.entity.AbstractTag;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParserXMLFileDAO implements IParserXMLDAO {

    @Override
    public AbstractTag parseXML(String path) {
        Stack<AbstractTag> stack = new Stack<>();
        ParserXMLFactory factory = new ParserXMLFactory();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(path)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                factory.getHandler(stack, line).handle();
            }
            if(stack.size() == 1) {
                return (stack.pop());
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

}
