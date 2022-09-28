package qa.guru.listCollection;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<String> listVacancyInCompany = new ArrayList<>();

    void addNewCompany(String company) {
        if (!listVacancyInCompany.contains(company)) {
            listVacancyInCompany.add(company);
        }
    }

    void printAllCompany() {
        for (String listVacancyInCompany : listVacancyInCompany) {
            System.out.println("Сохраненное значение: " + listVacancyInCompany);
        }
    }
}
