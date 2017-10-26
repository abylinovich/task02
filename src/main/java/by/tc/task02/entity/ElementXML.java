package by.tc.task02.entity;

import java.util.ArrayList;
import java.util.List;

public class ElementXML {

    private String name;
    private List<AttributeXML> attributes = new ArrayList<>();
    private List<ElementXML> children = new ArrayList<>();
    private String content;

    public ElementXML(String name) {
        this.name = name;
    }

    public void addAttribute(AttributeXML attribute) {
        attributes.add(attribute);
    }

    public void addChild(ElementXML child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    public List<AttributeXML> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeXML> attributes) {
        this.attributes = attributes;
    }

    public List<ElementXML> getChildren() {
        return children;
    }

    public void setChildren(List<ElementXML> children) {
        this.children = children;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
