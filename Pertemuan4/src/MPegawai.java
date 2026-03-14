import java.time.LocalDate;
import java.time.Period;

public class MPegawai {
  public static void main(String[] args) {
    DosenTetap DTP1 = new DosenTetap(
      "9545647548", "Andi Kurniawan",
      LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1),
      5000000.0, "78647324", "Fakultas Sains dan Matematika" 
    );

    DosenTamu DTM1 = new DosenTamu(
      "9050770155", "Ivander Airell Dickman Satya Dinansi",
      LocalDate.of(1992, 10, 15), LocalDate.of(2015, 1, 1),
      5500000.0, "78647330", "Fakultas Ilmu Sosial dan Ilmu Politik", LocalDate.of(2026, 3, 10) 
    );

    DosenTetap DTP2 = new DosenTetap();
    DTP2.setNip("9171850155");
    DTP2.setNama("Dionisius Alano Fransrawi");
    DTP2.setTglLahir(LocalDate.of(1998, 6, 28));
    DTP2.setTmt(LocalDate.of(2021,2,20));
    DTP2.setGajiPokok(6000000.0);
    DTP2.setNidn("78647338");
    DTP2.setFakultas("Fakultas Hukum");

    DTP1.printInfo();
    DTP2.printInfo();
    DTM1.printInfo();
  }  
}
