package lab3.visitor;

public interface visitor  {
    void visit(Book book);
    void visit(Video video);
    void visit(Audio audio);
}
