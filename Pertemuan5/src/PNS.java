/*  NAMA FILE   : Manusia.java
    DESKRIPSI   : berisi class atribut dan method dalam abstract class Manusia
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 17/03/2026
*/

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
  //ATRIBUT
  private String nip;
  private static int counterPns = 0;

  //KONSTRUKTOR
  public PNS(){
    counterPns++;
  }

  //OVERIDING KONSTRUKTOR
  public PNS(String nip, String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
    super(nama, tglMulaiKerja, alamat, pendapatan);
    this.nip = nip;
    counterPns++;
  }

  //SELECTOR
  public String getNip(){
    return nip;
  }

  public static int getCounterPns(){
    return counterPns;
  }

  //MUTATOR
  public void setNip(String nip){
    this.nip = nip;
  }

  //ABSTRACT
  @Override
  public int hitungMasaKerja(){
    LocalDate tglSekarang = LocalDate.of(2026, 3, 17);
    Period masaKerja = Period.between(getTglMulaiKerja(), tglSekarang);
    return masaKerja.getYears() + 6; //DIGIT NIM KE-14 = 6
  }

  //INTERFACE
  public double hitungPajak(){
    return 0.10 * getPendapatan();
  }


  //PRINT
  @Override
  public void cetakInfo(){
    super.cetakInfo();
    System.out.println("Masa Kerja          : " + hitungMasaKerja() + " Tahun");
    System.out.println("Pajak               : " + hitungPajak());
    System.out.println("NIP                 : " + nip);
    System.out.println("========================================");
  }


}
