package project2;

import java.util.ArrayList;
import java.util.HashMap;

public class Parliament {
    String country;
    ArrayList<String> numeParlamentari = new ArrayList<String>();
    HashMap<Integer, String> ordonanteDeUrgenta = new HashMap<Integer, String>();
    public Parliament(String country) {
        this.country = country;
    }
    public void addParlamentar(String nume) {
        numeParlamentari.add(nume);
    }
    public void removeParlamentar(String nume) {
        numeParlamentari.remove(nume);
    }
    public void addODU(String lege) {
        int index = ordonanteDeUrgenta.size();
        Integer iIndex = Integer.valueOf(index);
        ordonanteDeUrgenta.put(iIndex, lege);
    }
    public void printODU(Integer index) {
        System.out.println(ordonanteDeUrgenta.get(index-1));
    }
    public boolean checkODU(String lege) {
        if(ordonanteDeUrgenta.get(lege) == null) return false;
        return true;
    }
}
