package lab2.ch2;

public class Studio  {
    private String name;
    private Film[] films;

    public Studio(String nume, Film[] filme) {
        this.name = nume;
        this.films = filme;
    }
    public int getStudioMovies() {
        return films.length;
    }
    public String getStudioName() {
        return name;
    }

    public String getActorsName() {
        /*
        for(int i=0; i<films.length; i++) {
           if(films[i].getActorName() == "actor cu 2 oscaruri") return 1;
        }

        */
        String aux = "";
        for(int i=0; i<films.length; i++) {
            aux = aux + films[i].getActorsName();
        }
        return aux;
    }

}
