package lab2.ch2;


public class Actor {
    private String name;
    private int varsta;
    private Premiu[] awards;
    public Actor(String n, int v, Premiu[] premii) {
        this.name=n;
        this.varsta=v;
        this.awards = premii;

    }
    public String getActorName() {
        return name;
    }
    public int getActorAge(){
        return varsta;
    }
}

