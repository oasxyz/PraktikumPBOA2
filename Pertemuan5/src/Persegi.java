/*  NAMA FILE   : Persegi.java
    DESKRIPSI   : berisi class atribut dan method dalam class Persegi
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 16/03/2026
*/


public class Persegi extends BangunDatar implements IResize{
  //ATRIBUT
  private double sisi;

  public Persegi(){
    setJmlSisi(4);
  }

  //METHOD
  //KONSTRUKTOR
  public Persegi(double sisi, String warna, String border){
    super(4,warna,border);
    this.sisi = sisi;
  }

  //MUTATOR
  public void setSisi(double sisi){
    this.sisi = sisi;
  }
  
  //SELEKTOR
  public double getSisi(){
    return sisi;
  }

  @Override
  public double getLuas(){
    return sisi * sisi;
  } 

  @Override
  public double getKeliling(){
    return sisi * 4;
  }

  public double getDiagonal(){
    return sisi * Math.sqrt(2);
  }

  //INTERFACE
  @Override
  public void zoomIn(){
    sisi = sisi * 1.1;
  }

  @Override
  public void zoomOut(){
    sisi = sisi * 0.9;
  }

  @Override
  public void zoom(int percent){
    sisi = sisi * percent/100;
  }

  //PRINT
  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Sisi: " + sisi);
  }
}
