package by.tc.task02.dao.xmltaghandler;

import by.tc.task02.entity.AbstractTag;
import by.tc.task02.entity.TagAttribute;

public class AttributeHandlerUtil {

    private static final int TAG_ATTRIBUTE_KEY = 0;
    private static final int TAG_ATTRIBUTE_VALUE = 1;

    public static void setAttributes(AbstractTag tag, String attributes) {
        if (attributes != null) {
            attributes = attributes.trim();
            String[] attributesArray = attributes.split("\\s+");
            for(String attribute : attributesArray) {
                String[] pair = attribute.split("=", 2);
                String attributeName = pair[TAG_ATTRIBUTE_KEY];
                String attributeValue = pair[TAG_ATTRIBUTE_VALUE];
                tag.addAttribute(new TagAttribute(attributeName, attributeValue));
            }
        }
    }

}
