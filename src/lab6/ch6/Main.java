package lab6.ch6;

public class Main {
    static void setSpiralMatrix(int n, int a[][]) {
        int val = 1;
        int k = 0, l = 0, cn=n;
        while (k < n && l < n) {
            for (int i = l; i < n; ++i) a[k][i] = val++;
            k++;
            for (int i = k; i < n; ++i) a[i][n-1] = val++;
            cn=cn-1;

            if (k < cn) {
                for (int i = n-1; i >= l; --i) a[n-1][i] = val++;
                n--;
            }
            if (l < n) {
                for (int i = n-1; i >= k; --i) a[i][l] = val++;
                l++;
            }
        }
    }
    static void printMatrix(int n, int a[][]) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) System.out.print(a[i][j] + " ");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        setSpiralMatrix(n, a);
        printMatrix(n, a);
    }
}
