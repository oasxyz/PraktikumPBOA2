/*  NAMA FILE   : Pengusaha.java
    DESKRIPSI   : berisi class atribut dan method dalam class Pengusaha
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 17/03/2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
  //ATRIBUT
  private String npwp;
  private static int counterPengusaha = 0;

  //KONSTRUKTOR
  public Pengusaha(){
    counterPengusaha++;
  }

  //OVERLOADING KONSTRUKTOR
  public Pengusaha(String npwp, String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
    super(nama, tglMulaiKerja, alamat, pendapatan);
    this.npwp = npwp;
    counterPengusaha++;
  }

  //SELECTOR
  public String getNpwp(){
    return npwp;
  }

  public static int getCounterPengusaha(){
    return counterPengusaha;
  }

  //MUTATOR
  public void setNpwp(String npwp){
    this.npwp = npwp;
  }

  //ABSTRACT
  @Override
  public int hitungMasaKerja(){
    LocalDate tglSekarang = LocalDate.of(2026, 3, 17);
    Period masaKerja = Period.between(getTglMulaiKerja(), tglSekarang);
    return masaKerja.getYears() + 4; //DIGIT NIM KE-13 = 4
  }

  //INTERFACE
  @Override
  public double hitungPajak(){
    return 0.15 * getPendapatan();
  }

  //PRINT
  @Override
  public void cetakInfo(){
    super.cetakInfo();
    System.out.println("Masa Kerja          : " + hitungMasaKerja() + " Tahun");
    System.out.println("Pajak               : " + hitungPajak());
    System.out.println("NPWP                : " + npwp);
    System.out.println("========================================");
  }
}
