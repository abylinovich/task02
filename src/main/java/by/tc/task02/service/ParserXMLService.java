package by.tc.task02.service;

import by.tc.task02.dao.IParserXMLDAO;
import by.tc.task02.dao.ParserXMLDAO;
import by.tc.task02.entity.ElementXML;

public class ParserXMLService implements IParserXMLService {

    @Override
    public ElementXML parseXML(String path) {
        IParserXMLDAO reader = new ParserXMLDAO();
        return reader.parseXML(path);
    }

}
