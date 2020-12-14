package lab4.Anagram;

import lab4.SecretMessage.SecretMessage;

public class Main {
    public static void main(String[] args) {
        Anagram message = new Anagram("./src/lab4/Anagram/message.txt");
        message.verify();


        //System.out.println(message.toString());
    }
}
