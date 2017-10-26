package by.tc.task02.view;

import by.tc.task02.entity.ElementXML;

public class ConsolePrinter implements XMLPrinter {

    @Override
    public void printXML(ElementXML entity) {
        System.out.println(entity);
    }

}
