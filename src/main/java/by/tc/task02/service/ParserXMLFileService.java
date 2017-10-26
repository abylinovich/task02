package by.tc.task02.service;

import by.tc.task02.dao.IParserXMLDAO;
import by.tc.task02.dao.ParserXMLFileDAO;
import by.tc.task02.entity.TagXML;

public class ParserXMLFileService implements IParserXMLService {

    @Override
    public TagXML parseXML(String path) {
        IParserXMLDAO reader = new ParserXMLFileDAO();
        return reader.parseXML(path);
    }

}
