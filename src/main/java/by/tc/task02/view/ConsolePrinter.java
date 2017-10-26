package by.tc.task02.view;

import by.tc.task02.entity.AbstractTag;
import by.tc.task02.entity.ContentTag;
import by.tc.task02.entity.ParentTag;

import static by.tc.task02.entity.TagType.PARENT_TAG;

public class ConsolePrinter implements XMLPrinter {

    @Override
    public void printEntities(AbstractTag entity) {
         if(entity.getTagType() == PARENT_TAG) {
             ParentTag parentTag = (ParentTag) entity;
             for(AbstractTag child : parentTag.getChildrenList()) {
                 printEntities(child);
             }
         } else {
             ContentTag contentTag = (ContentTag) entity;
             System.out.println(contentTag);
         }
    }

}
