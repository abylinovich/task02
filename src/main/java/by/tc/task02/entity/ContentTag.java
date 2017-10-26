package by.tc.task02.entity;

import java.util.Objects;

import static by.tc.task02.entity.TagType.CONTENT_TAG;

public class ContentTag extends AbstractTag {

    private String content;

    public ContentTag(String name) {
        super(name);
    }

    @Override
    public TagType getTagType() {
        return CONTENT_TAG;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContentTag)) return false;
        if (!super.equals(o)) return false;
        ContentTag that = (ContentTag) o;
        return Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content);
    }

    @Override
    public String toString() {
        return super.toString() +
                " = \'" + content + '\'';
    }
}
