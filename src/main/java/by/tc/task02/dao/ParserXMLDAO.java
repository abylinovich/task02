package by.tc.task02.dao;

import by.tc.task02.entity.ElementXML;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ParserXMLDAO implements IParserXMLDAO {

    @Override
    public ElementXML parseXML(String path) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(path)))) {
            return null;
        } catch (Exception e) {
            return null;
        }
    }

}
