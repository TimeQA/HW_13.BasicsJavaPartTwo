package qa.guru.setCollection;

import qa.guru.listCollection.Company;

public class SetCollection {
    public static void main(String[] args) {

        Application allApp = new Application();
        allApp.addNewApplication("Telegram");
        allApp.addNewApplication("Яндекс еда");


        Application allAppAnother = new Application();
        allApp.addNewApplication("Telegram");
        allApp.addNewApplication("Яндекс еда");
        allApp.addNewApplication("Яндекс еда");

        System.out.println(allApp.equals(allAppAnother));
        allApp.printAllApp();
    }
}
