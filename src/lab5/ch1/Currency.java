package lab5.ch1;

public class Currency {
    private String name;
    private float value;

    public Currency() { }

    protected Currency(float value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setValue(float value) {
        this.value = value;
    }
}
