import java.time.LocalDate;
import java.time.Period;

public class MPegawai {
  public static void main(String[] args) {
    DosenTetap DT1 = new DosenTetap(
      "9545647548", "Andi Kurniawan",
      LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1),
      5000000.0, "78647324", "Fakultas Sains dan Matematika" 
    );

    DT1.printInfo();
  }  
}
