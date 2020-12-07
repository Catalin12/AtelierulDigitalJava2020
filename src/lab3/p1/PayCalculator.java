package lab3.p1;

public class PayCalculator {
    public int calculate(String position) {
        if(position.equals("pos1")) return 2000;
        if(position.equals("manager")) return 3000;
        return 1000;
    }
}
