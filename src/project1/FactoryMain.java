package project1;

public class FactoryMain {
    public static void main(String[] args) {
        /*
        OperatingLibrary osf = new OperatingLibrary();
        BookLibrary obj = osf.getInstance("Comedy");
        obj.returnDate();
        */

        BookLibrary book1 = OperatingLibrary.getInstance("Thriller");
        book1.returnDetails();

        BookLibrary book2 = OperatingLibrary.getInstance("Comedy");
        book1.returnDetails();

    }
}
