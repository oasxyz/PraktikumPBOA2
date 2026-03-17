/*  NAMA FILE   : Lingkaran.java
    DESKRIPSI   : berisi class atribut dan method dalam class Lingkaran
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 16/03/2026
*/

public class Lingkaran extends BangunDatar implements IResize{
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

  @Override
  public double getLuas(){
    return Math.PI * jari * jari;
  }

  @Override
  public double getKeliling(){
    return 2 * Math.PI * jari;
  }

  //INTERFACE
  @Override
  public void zoomIn(){
    jari = jari * 1.1;
  }

  @Override
  public void zoomOut(){
    jari = jari * 0.9;
  }

  @Override
  public void zoom(int percent){
    jari = jari * percent/100;
  }

  //PRINT
  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Jari: " + jari);
  }
}
