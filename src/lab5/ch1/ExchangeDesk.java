package lab5.ch1;

public class ExchangeDesk {
    public <A extends Currency,B extends Currency> B exchange(A from, Class<B> to, float rate) {
        //aici to e o clasa
        B toReturn=null;
        try {
            toReturn = to.getDeclaredConstructor().newInstance(); //se duce pe to, ii ia constructorul si face o instanta de tipul lui to
            toReturn.setValue(from.getValue() * rate);
        } catch(Exception e) {
            System.out.println(e);
        }


        return toReturn;
    }
}
