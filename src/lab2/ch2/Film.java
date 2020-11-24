package lab2.ch2;


public class Film {
    private int anAparitie;
    private String name;
    private Actor[] actors;
    //public Film(int anAparitie, String nume, Actor[])

    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie=anAparitie;
        this.name=nume;
        this.actors = actori;
    }
    public String getActorsName() {
        String aux = "";
        for(int i=0; i<actors.length; i++) aux = aux + actors[i].getActorName() + "\n";
        return aux;
    }
    public boolean seniorActors() {
        for(int i=0; i<actors.length; i++) if(actors[i].getActorAge() >= 50) return true;
        return false;
    }
    public String getName() {
        return name;
    }
}
