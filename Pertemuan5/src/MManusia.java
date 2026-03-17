/*  NAMA FILE   : MManusia.java
    DESKRIPSI   : berisi main class dari Manusia dengan mengimplementasikan interface ke PNS, Pengusaha, dan Petani
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 17/03/2026
*/

import java.time.LocalDate;
import java.time.Period;

public class MManusia {
  public static void main(String[] args) {
    System.out.println("================== PNS =================");
    PNS PS1 = new PNS("198302032006041002", "Satriyo", LocalDate.of(2016, 4, 1), "Jl. Seroja", 15000000);

    // DENGAN MENGGUNAKAN SETTER / MUTATOR
    PNS PS2 = new PNS();
    PS2.setNip("198302032006041002");
    PS2.setNama("Cristiano Ronaldo");
    PS2.setDate(LocalDate.of(2020, 5, 30));
    PS2.setAlamat("Jl. Portugis");
    PS2.setPendapatan(25000000);

    PS1.cetakInfo();
    PS2.cetakInfo();
    System.out.println("Counter PNS: " + PNS.getCounterPns());
    System.out.println("========================================");


    System.out.println("============== Pengusaha ===============");
    Pengusaha PE1 = new Pengusaha("000-556-773-212-000-5", "Adhy", LocalDate.of(2010, 1, 1), "Jl. Air", 55000000);
    PE1.cetakInfo();
    System.out.println("Counter Pengusaha: " + Pengusaha.getCounterPengusaha());
    System.out.println("========================================");


    System.out.println("================ Petani ================");
    Petani PI1 = new Petani("Wonogiri", "Nugraha", LocalDate.of(2019, 1, 9), "Jl. Bunga 9 Tembalang", 5000000);
    PI1.cetakInfo();
    System.out.println("Counter Petani: " + Petani.getCounterPetani());
    System.out.println("========================================");
  }
}
