package qa.guru.listCollection;

public class ListCollectionCompany {

    public static void main(String[] args) {

        String[] companies = new String[]{"Google", "Meta", "Netflix"}; // инициализация массива по факту его наполнения при выполнении
        String[] emptyAutos = new String[3]; // создается пустой массив с заданны

        Company allCompany = new Company(); // Инициализация пустым моссивом
        allCompany.addNewCompany("Google");
        allCompany.addNewCompany("Meta");
        allCompany.addNewCompany("Meta");
        allCompany.printAllCompany();
    }
}
