package qa.guru.stringArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dealer {

    String[] storeAutos;

    public Dealer(String[] storeAutos) {
        this.storeAutos = storeAutos;
    }

//    void addNewAuto(String auto) {
//        storeAutos.add(auto);
//    }
//    void addNewAuto(String auto) {
//        storeAutos[0] = auto;
//    }

    void addNewAuto(String auto) {
        int i = 0;
        while (i < storeAutos.length) {
            if (storeAutos[i] == null) {
                storeAutos[i] = auto;
                break;
            }
            i++;
        }

        for (int x = 0; x < storeAutos.length; x++) {
            if (storeAutos[x] == null) {
                storeAutos[x] = auto;
                break;
            }
        }
    }

    void printAllAuto() {
        for (String storeAuto : storeAutos) {
            System.out.println("Сохраненное значение: " + storeAuto);
        }
//        System.out.println(Arrays.toString(storeAutos));
    }
}
