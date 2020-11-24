package lab2.ch2;

public class Main {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1920);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("Actor cu 2 oscaruri", 35, new Premiu[] {oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("Actor cu oscar din 2000", 55, new Premiu[] {oscar2000});
        Actor actorOscar2018 = new Actor("Actor cu oscar din 2018", 23, new Premiu[] {oscar2018});
        Actor actorFaraPremii01 = new Actor("Actor fara oscar 01", 33, new Premiu[] {});
        Actor actorFaraPremii02 = new Actor("Actor fara oscar 02", 60, new Premiu[] {});
        Actor actorFaraPremii03 = new Actor("Actor fara oscar 03", 20, new Premiu[] {});


        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[] {});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[] { actorFaraPremii01, actorFaraPremii02, actorFaraPremii03 });
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[] { actorFaraPremii01, actorFaraPremii02, actorFaraPremii03 });
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[] { actorOscar2010, actorOscar2018, actorFaraPremii02 });
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[] { actorFaraPremii02, actorFaraPremii03 });

        Studio studio1 = new Studio("MGM", new Film[] { film1, film2 });
        Studio studio2 = new Studio("Disney", new Film[] { film3, film4, film5 });
        //stage 3.1
        if(studio1.getStudioMovies() >= 2) System.out.println(studio1.getStudioName());
        if(studio2.getStudioMovies() >= 2) System.out.println(studio2.getStudioName());
        //stage 3.2
        if(studio1.getActorsName().contains("actor cu 2 oscaruri")) System.out.println(studio1.getStudioName());
        if(studio2.getActorsName().contains("actor cu 2 oscaruri")) System.out.println(studio2.getStudioName());
        //stage 3.3
        if(film1.seniorActors()) System.out.println(film1.getName());
        if(film2.seniorActors()) System.out.println(film2.getName());
        if(film3.seniorActors()) System.out.println(film3.getName());
        if(film4.seniorActors()) System.out.println(film4.getName());
        if(film5.seniorActors()) System.out.println(film5.getName());
    }
}