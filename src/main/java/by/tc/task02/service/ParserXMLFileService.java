package by.tc.task02.service;

import by.tc.task02.dao.IParserXMLDAO;
import by.tc.task02.dao.ParserXMLFileDAO;
import by.tc.task02.entity.AbstractTag;
import by.tc.task02.entity.ParentTag;

public class ParserXMLFileService implements IParserXMLService {

    @Override
    public AbstractTag parseXML(String path) {
        IParserXMLDAO parser = new ParserXMLFileDAO();
        return parser.parseXML(path);
    }

}
