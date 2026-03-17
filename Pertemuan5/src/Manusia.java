/*  NAMA FILE   : Manusia.java
    DESKRIPSI   : berisi class atribut dan method dalam abstract class Manusia
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 17/03/2026
*/

import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
  //ATRIBUT
  private String nama;
  private LocalDate tglMulaiKerja;
  private String alamat;
  private double pendapatan;
  private static int counterMns = 0;

  //KONSTRUKTOR
  public Manusia(){
    counterMns++;
  }

  //OVERIDING KONSTRUKTOR
  public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan){
    this.nama = nama;
    this.tglMulaiKerja = tglMulaiKerja;
    this.alamat = alamat;
    this.pendapatan = pendapatan;
    counterMns++;  
  }

  //SELECTOR
  public String getNama(){
    return nama;
  }

  public LocalDate getTglMulaiKerja(){
    return tglMulaiKerja;
  }

  public String getAlamat(){
    return alamat;
  }

  public double getPendapatan(){
    return pendapatan;
  }

  public static int getCounterMns(){
    return counterMns;
  }

  //MUTATOR
  public void setNama(String nama){
    this.nama = nama;
  }

  public void setDate(LocalDate tglMulaiKerja){
    this.tglMulaiKerja = tglMulaiKerja;
  }

  public void setAlamat(String alamat){
    this.alamat = alamat;
  }

  public void setPendapatan(double pendapatan){
    this.pendapatan = pendapatan;
  }

  //ABSTRACT
  public abstract int hitungMasaKerja();


  //PRINT
  public void cetakInfo(){
    System.out.println("Nama                : " + nama);
    System.out.println("Tanggal Mulai Kerja : " + tglMulaiKerja);
    System.out.println("Alamat              : " + alamat);
    System.out.printf("Pendapatan          : %.0f\n", pendapatan);
  }
}
