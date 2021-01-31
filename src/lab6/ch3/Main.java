package lab6.ch3;

public class Main {
    static void bellNumber(int n)  {
        int[][] v = new int[n+1][n+1];
        v[0][0]=1;
        int c = 1;
        System.out.println(v[0][0]);
        while(n > c) {
            for(int i=0; i<c+1; i++) {
                if(i == 0 ) v[c][i] = v[c-1][c-1];
                else v[c][i] = v[c][i-1]+v[c-1][i-1];
                System.out.print(v[c][i] + " ");
            }
            c++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        bellNumber(5);
    }
}
/*
1
1   2
2   3   5
5   7   10  15
15  ...
 */