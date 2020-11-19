package lab1;

public class PairOfTwo {

    public static void main(String[] args) {
        int[] v = {3, 2, -3, -2, 3, 0};
        int[] aux = new int[v.length];
        int count=0;
        for(int i=0; i<v.length-1; i++)
        for(int j=i+1; j<v.length; j++) if(v[i] + v[j] == 0 && aux[i] == 0 && aux[j] == 0) {
            System.out.printf("(%d, %d) => %d\n", v[i], v[j], v[i]+v[j]);
            aux[i]=1; aux[j]=1;
            count++;
        }
        System.out.print(count);

    }
}
