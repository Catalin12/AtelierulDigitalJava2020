package lab4.SecretMessage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {
    public String message="";
    public SecretMessage(String location) {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(location)));
            while(scanner.hasNext()) message = message + scanner.next();
        } catch(Exception e) {
            System.out.println("not found");
        }
    }
    public void DecodeSecretMessage() {
        for(int i=0; i<message.length(); i++)
        if(Character.isUpperCase(message.charAt(i))) {
            if(message.charAt(i) == 'X') System.out.print(" ");
            else System.out.print(message.charAt(i));
        }
    }

}
