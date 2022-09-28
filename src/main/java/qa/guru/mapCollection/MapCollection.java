package qa.guru.mapCollection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {

        Map<Integer, Electronic> electronics = new HashMap<>();

        Electronic iphone = new Electronic("Apple", "Smartphone", 80);
        Electronic freebuds = new Electronic("HUAWEI", "earphone", 10);

        electronics.put(12345, iphone);
        electronics.put(23456, freebuds);

        Electronic electronic = electronics.get(12345);

        for (Integer integer : electronics.keySet()) {
        }

        for (Map.Entry<Integer, Electronic> entry : electronics.entrySet()) {
            if (entry.getValue().equals(12345)) {
                entry.getValue().sayDevice();
            }
        }
    }
}
