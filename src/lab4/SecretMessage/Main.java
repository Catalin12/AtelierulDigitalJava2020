package lab4.SecretMessage;

import lab4.PhoneBook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        SecretMessage message = new SecretMessage("./src/lab4/SecretMessage/message.txt");
        message.DecodeSecretMessage();
    }

}
