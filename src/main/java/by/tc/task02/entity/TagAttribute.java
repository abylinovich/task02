package by.tc.task02.entity;

import java.util.Objects;

public class TagAttribute {

    private String key;
    private String value;

    public TagAttribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TagAttribute)) return false;
        TagAttribute that = (TagAttribute) o;
        return Objects.equals(key, that.key) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return " " + key + "=" + value;
    }

}
