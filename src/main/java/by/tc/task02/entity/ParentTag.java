package by.tc.task02.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static by.tc.task02.entity.TagType.PARENT_TAG;

public class ParentTag extends AbstractTag {

    private List<AbstractTag> childrenList = new ArrayList<>();

    public ParentTag(String name) {
        super(name);
    }

    @Override
    public TagType getTagType() {
        return PARENT_TAG;
    }

    public void addChild(AbstractTag child) {
        childrenList.add(child);
    }

    public List<AbstractTag> getChildrenList() {
        return childrenList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParentTag)) return false;
        if (!super.equals(o)) return false;
        ParentTag parentTag = (ParentTag) o;
        return Objects.equals(childrenList, parentTag.childrenList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), childrenList);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
