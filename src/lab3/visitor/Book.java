package lab3.visitor;

public class Book implements element {
    private int numberOfPages;
    private String name;

    public Book(int numberOfPages, String name) {
        this.numberOfPages = numberOfPages;
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void accept(visitor v) { v.visit(this); }
}
