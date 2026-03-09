/*  NAMA FILE   : Lingkaran.java
    DESKRIPSI   : berisi class atribut dan method dalam class Lingkaran
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 09/03/2026
 */

public class Lingkaran extends BangunDatar {
  //ATRIBUT
  private double jari;


  //METHOD
  //KONSTRUKTOR
  public Lingkaran(){

  }

  public Lingkaran(double jari, String warna, String border){
    super(0, warna, border);
    this.jari = jari;
  }
  

  //MUTATOR
  public void setJari(double jari){
    this.jari = jari;
  }


  //SELEKTOR
  public double getJari(){
    return jari;
  }

  public double getLuas(){
    return Math.PI * jari * jari;
  }

  public double getKeliling(){
    return 2 * Math.PI * jari;
  }


  //PRINT
  public void printInfo(){
    super.printInfo();
    System.out.println("Jari: " + jari);
    System.out.println();
  }
}
