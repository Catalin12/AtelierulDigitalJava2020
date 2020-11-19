package lab1;

public class PairOfThree {
    public static void main(String[] args) {
        int[] v = {-1, -1, -1, 2, -1, -1, 4, 5, -23, 23, -23, 23, -1, -1, -1, 2, 100, 100, -200};
        int[] aux = new int[v.length];
        for(int i=0; i<v.length-2; i++) {
            for(int j=i+1; j<v.length-1; j++){
                for(int x=j+1; x<v.length; x++) if(v[i]+v[j]+v[x] == 0 && (aux[i]==0 && aux[j] == 0 && aux[x] == 0)) {
                    System.out.printf("(%d, %d, %d) => %d\n", v[i], v[j], v[x], v[i]+v[j]+ v[x]);
                    aux[i]=1; aux[j]=1; aux[x]=1;
                }
            }
        }
    }
}
