package lab4.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/lab4/PhoneBook/input.txt");
        //phoneBook.toString();
        //System.out.println(phoneBook);
        System.out.println("Abbey " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul " + phoneBook.getByName("Abdul"));
    }
}
