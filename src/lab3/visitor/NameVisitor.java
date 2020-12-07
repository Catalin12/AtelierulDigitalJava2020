package lab3.visitor;

public class NameVisitor implements visitor {
    private String name="";
    public void visit(Book book) {
        name+=book.getName() + " book, ";
    }
    public void visit(Video video) {
        name+=video.getName() + " video, ";
    }
    public void visit(Audio audio) {
        name+=audio.getName() + " audio, ";
    }

    public String getName() {
        return name;
    }
}
