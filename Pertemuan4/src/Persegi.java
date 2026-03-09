/*  NAMA FILE   : Persegi.java
    DESKRIPSI   : berisi class atribut dan method dalam class Persegi
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 09/03/2026
 */


public class Persegi extends BangunDatar {
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

  public double getLuas(){
    return sisi * sisi;
  } 

  public double getKeliling(){
    return sisi * 4;
  }

  public double getDiagonal(){
    return sisi * Math.sqrt(2);
  }

  //PRINT
  public void printInfo(){
    super.printInfo();
    System.out.println("Sisi: " + sisi);
    System.out.println();
  }
}
