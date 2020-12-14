package lab4.Anagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Anagram {
    public String message="";
    public Anagram(String location) {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(location)));
            while(scanner.hasNext()) message = message + scanner.next() + " ";
        } catch(Exception e) {
            System.out.println("not found");
        }
    }
    public void verify() {
        String[] words = message.split(" ");
        try {
            FileWriter myWriter = new FileWriter("./src/lab4/Anagram/output.txt");
            for(String currentWord : words) {
                if(checkAnagram(currentWord, "listen")) myWriter.write(currentWord + "\n");
            }
            myWriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
    public String toString() {
        return message.toString();
    }
    private boolean checkAnagram(String stringOne , String stringTwo){
        char[] first = stringOne.toLowerCase().toCharArray();
        char[] second = stringTwo.toLowerCase().toCharArray();
        // if length of strings is not same
        if (first.length != second.length) return false;
        int[] counts = new int[26];
        for (int i = 0; i < first.length; i++){
            counts[first[i]-97]++;
            counts[second[i]-97]--;
        }
        for(int i = 0; i<26; i++)
            if (counts[i] != 0)
                return false;
        return true;
    }
}
