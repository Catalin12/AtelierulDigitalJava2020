package lab1;

public class FooBarQix {
    public static String compute(int n) {
        String aux = n + " => ";
        int cn = n;
        if(n % 3 == 0) aux = aux + "Foo";
        if(n % 5 == 0) aux = aux + "Bar";
        if(n % 7 == 0) aux = aux + "Qix";
        while(n>0) {
            if(n%10 == 3) aux = aux + "Foo";
            if(n%10 == 5) aux = aux + "Bar";
            if(n%10 == 7) aux = aux + "Qix";
            n/=10;
        }
        if(aux.length() == (int) (Math.log10(cn) + 1) + 4) aux = aux + Integer.toString(cn);
        aux = aux + "\n";
        return aux;
    }
    /*
    public static String compute2(int n) {

    }
     */
    public static void main(String[] args) {
        for(int i=1; i<100; i++) System.out.println(compute(i));
        /*
        compute2(101);
        compute2(303);
        compute2(105);
        compute2(10101);
         */

    }
}
