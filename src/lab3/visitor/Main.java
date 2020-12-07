package lab3.visitor;

public class Main {
    public static void main(String[] args) {
        element e1 = new Book(50, "Book Name");
        element e2 = new Video("Video Name", 120);
        element e3 = new Audio(180, "Album", 20);

        element[] elements = new element[] { e1, e2, e3 };
        visitor visitor = new DurationVisitor();
        for(element currentElement : elements) {
            currentElement.accept(visitor);
        }
        System.out.println(visitor);

        NameVisitor nameVisitor = new NameVisitor();
        for(element currentElement : elements) {
            currentElement.accept(nameVisitor);
        }
        System.out.println(nameVisitor.getName());

    }
}
