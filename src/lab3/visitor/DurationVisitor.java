package lab3.visitor;

public class DurationVisitor implements visitor {
    private float totalDuration;
    public void visit(Book book) {
        totalDuration+=book.getNumberOfPages() * 5;
    }
    public void visit(Video video) {
        totalDuration+=video.getTime() + video.getTime()/30*5;
    }
    public void visit(Audio audio) {
        totalDuration+=audio.getTime() + audio.getNumberOfSongs()*0.3;
    }

    public String toString() {
        return "The visited elements have a total duretion of: " + (int)totalDuration + "mins.";
    }
}
