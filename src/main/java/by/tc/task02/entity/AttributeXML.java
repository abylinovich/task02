package by.tc.task02.entity;

public class AttributeXML {

    private String key;
    private String value;

    public AttributeXML(String key, String value) {
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
    public String toString() {
        return " " + key + "=" + value;
    }

}
