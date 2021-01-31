package quiz_help;

import com.sun.source.tree.Tree;

import java.math.BigInteger;
import java.util.*;

public class Main {
    static private int getNumber(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        String numbers = new String("IVII");
        int value=0;
        for(int i=0; i<numbers.length()-1; i++) {
            char c = numbers.charAt(i);
            int nr = getNumber(c);
            for(int j=i+1; j<numbers.length(); j++) {
                char cc = numbers.charAt(j);
                int cnr = getNumber(cc);



            }
        }
    }
}
