package by.tc.task02.main;

import by.tc.task02.entity.TagXML;
import by.tc.task02.service.IParserXMLService;
import by.tc.task02.service.ParserXMLFileService;
import by.tc.task02.view.ConsolePrinter;
import by.tc.task02.view.XMLPrinter;

public class Main {

    public static void main(String[] args) {
        String filePath = "file.xml";
        IParserXMLService parser = new ParserXMLFileService();
        TagXML treeXML = parser.parseXML(filePath);
        XMLPrinter printer = new ConsolePrinter();
        printer.printXML(treeXML);
    }

}
