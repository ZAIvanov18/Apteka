import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Medicine med1 = new Medicine("paracetamol", 10, 20, LocalDate.of(1999, 03, 28));
    Medicine med2 = new Medicine("paracetamol", 10, 20, LocalDate.of(2026,03, 28));
    Medicine med3 = new Medicine("paracetamol", 10, 20, LocalDate.of(2020,03,28));
        List<Medicine> meds = Arrays.asList(med1, med2, med3);
        System.out.println();
        Medicine.showMedicineThatCostsMoreThan5(meds);
        Medicine.showMedicineThatHaveLessThan10(meds);
        Medicine.showExpiredMedicine(meds, LocalDate.of(2022, 12, 12));
    }
}