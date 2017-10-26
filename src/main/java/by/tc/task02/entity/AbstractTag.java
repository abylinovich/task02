package by.tc.task02.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractTag {

    private String name;
    private List<TagAttribute> attributesList = new ArrayList<>();

    public AbstractTag(String name) {
        this.name = name;
    }

    public abstract TagType getTagType();

    public String getName() {
        return name;
    }

    public List<TagAttribute> getAttributesList() {
        return attributesList;
    }

    public void addAttribute(TagAttribute attribute) {
        attributesList.add(attribute);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractTag)) return false;
        AbstractTag that = (AbstractTag) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(attributesList, that.attributesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attributesList);
    }

    @Override
    public String toString() {
        return "\'" + name + '\'';
    }
}
