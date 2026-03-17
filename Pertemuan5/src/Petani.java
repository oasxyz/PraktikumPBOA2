/*  NAMA FILE   : Manusia.java
    DESKRIPSI   : berisi class atribut dan method dalam abstract class Manusia
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 17/03/2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
  //ATRIBUT
  private String asal_kota;
  private static int counterPetani = 0;

  //KONSTRUKTOR
  public Petani(){
    counterPetani++;
  }

  //OVERLOADING KONSTRUKTOR
  public Petani(String asal_kota, String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
    super(nama, tglMulaiKerja, alamat, pendapatan);
    this.asal_kota = asal_kota;
    counterPetani++;
  }

  //SELECTOR
  public String getAsalKota(){
    return asal_kota;
  }

  public static int getCounterPetani(){
    return counterPetani;
  }

  //MUTATOR
  public void setAsalKota(String asal_kota){
    this.asal_kota = asal_kota;
  }

  //ABSTRACT
  @Override
  public int hitungMasaKerja(){
    LocalDate tglSekarang = LocalDate.of(2026,3,17);
    Period masaKerja = Period.between(getTglMulaiKerja(), tglSekarang);
    return masaKerja.getYears() + 0; //DIGIT NIM KE-12 = 0
  }

  //INTERFACE
  @Override
  public double hitungPajak(){
    return 0;
  }

  //PRINT
  @Override
  public void cetakInfo(){
    super.cetakInfo();
    System.out.println("Asal Kota           : " + asal_kota);
    System.out.println("Masa Kerja          : " + hitungMasaKerja() + " Tahun");
    System.out.println("Pajak               : " + hitungPajak());
    System.out.println("========================================");
  }
}
