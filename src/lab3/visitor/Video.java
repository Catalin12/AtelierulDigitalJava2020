package lab3.visitor;


public class Video implements element {
    private String name;
    private int time;

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public Video(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void accept(visitor v) { v.visit(this); }
}
