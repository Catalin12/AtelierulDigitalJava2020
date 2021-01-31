package project1;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Random;

public class Thriller implements BookLibrary {
    String bookName=null;
    long bookBorrewed=0;
    long bookReturn=0;
    int bookID=0;

    public Thriller() {
        this.bookBorrewed = System.currentTimeMillis()/1000; // milliseconds in seconds
        this.bookReturn = System.currentTimeMillis()/1000 + 60*60*24*30; // after 30 days
        this.bookID ++;
        //book name
        int i = (int)(Math.random()*((5-0)+1))+0;
        switch (i) {
            case 0:
                this.bookName = "Death of the Fake Shih Tzu";
                break;
            case 1:
                this.bookName = "Old Rites";
                break;
            case 2:
                this.bookName = "Heirs Of Rainbows";
                break;
            case 3:
                this.bookName = "Assassins Of Stone";
                break;
            case 4:
                this.bookName = "Child Of The Great";
                break;
            case 5:
                this.bookName = "Warrior Of Wind";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
    }

    @Override
    public void returnDetails() {

        System.out.println(
            "Book ID: " + this.bookID
            + "\nBook name: " + this.bookName
            + "\nBorrewed book: " + this.bookBorrewed + "[unix time]"
            + "\nExpire date: " + this.bookReturn + "[unix time]");
    }
}
