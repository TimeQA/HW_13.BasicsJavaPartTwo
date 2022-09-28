package qa.guru.stringArray;

public class StringArrayDealer {

    public static void main(String[] args) {
        String[] autos = new String[] {"volkswagen", "skoda", "audi"}; // инициализация массива по факту его наполнения при выполнении
        String[] emptyAutos = new String[3]; // создается пустой массив с заданным количеством позиций


        Dealer volkswagen = new Dealer(autos);
        Dealer multiDealer = new Dealer(emptyAutos); // Инициализация пустым моссивом
        multiDealer.addNewAuto("Porsche");
        multiDealer.addNewAuto("Audi");
        multiDealer.addNewAuto("SEAT");
        multiDealer.printAllAuto();

    }
}
