package catalin;

public class Query {
    private String key;
    private int value;

    public Query(int value,String key) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
