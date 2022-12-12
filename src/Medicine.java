import java.time.LocalDate;
import java.util.List;

public class Medicine {
    String name;
    double price;
    int inStock;
    LocalDate date;

    public Medicine(String name, double price, int inStock, LocalDate date) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.date = date;
    }

    public static void showMedicineThatCostsMoreThan5(List<Medicine> meds){
        for (int i = 0; i < meds.size(); i++) {
            if (meds.get(i).price >= 5.00) {
                System.out.println(meds.get(i));
            }
        }
    }

    public static void showMedicineThatHaveLessThan10(List<Medicine> meds){
        for (int i = 0; i < meds.size(); i++) {
            if (meds.get(i).inStock>10){
                System.out.println(meds.get(i));
            }

        }
    }

    public static void showExpiredMedicine(List<Medicine> meds, LocalDate currentDate){
        for (int i = 0; i < meds.size(); i++) {
            if (meds.get(i).date.isAfter(currentDate)){
                System.out.println(meds.get(i).name);
            }

        }
    }

}
