package project1;

public class OperatingLibrary {
    public static BookLibrary getInstance(String str) {
        switch (str) {
            case "Comedy":
                return new Comedy();
            case "Thriller":
                return new Thriller();
            case "Drama":
                return new Drama();
            default:
                throw new IllegalStateException("Unexpected value: " + str);
        }
    }
}
