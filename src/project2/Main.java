package project2;

import java.util.HashMap;

//singletone
public class Main {
    public static void main(String[] args) {
        Country Romania = new Country("Romania", 55);
        Romania.getParlament().addParlamentar("Popina Florin Catalin");
        Romania.getParlament().addParlamentar("Popina Catalin Florin");
        Romania.getParlament().addODU("1 / Ordonanta de urgenta in legatura cu restrictionarea consumului de zahar din alimente uzuale.");

        Romania.getParlament().removeParlamentar("Popina Catalin Florin");

        if(Romania.getParlament().checkODU("Ordonanta de urgenta in legatura cu cainii vagabonti."))
            System.out.println("Ordonanta nu exista!");
        else System.out.println("Ordonanta exista!");

        if(Romania.getParlament().checkODU("Ordonanta de urgenta in legatura cu restrictionarea consumului de zahar din alimente uzuale."))
            System.out.println("Ordonanta nu exista!");
        else Romania.getParlament().printODU(1);
    }
}
