package qa.guru.setCollection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Application {

    Set<String> storeApp = new HashSet<>();

    void addNewApplication(String app) {
        storeApp.add(app);
    }

    void printAllApp() {
        for (String storeApp : storeApp) {
            System.out.println("Сохраненное значение: " + storeApp);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return  (this.storeApp.size() == ((Application) o).storeApp.size()) &&
                (this.storeApp.containsAll(((Application) o).storeApp));

    }

    @Override
    public int hashCode() {
        return Objects.hash(storeApp);
    }
}
