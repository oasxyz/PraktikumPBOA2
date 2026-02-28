/*  NAMA FILE   : Garis.java
    DESKRIPSI   : berisi atribut dan method dalam class Garis
    PEMBUAT     : Romualdus Yoas Wicaksono
    TANGGAL     : 24/02/2026
 */

public class Garis {
  // Atribut
  private Titik titikAwal;
  private Titik titikAkhir;
  private static int counterGaris = 0;

  // Konstruktor default
  public Garis(){
    this.titikAwal = new Titik(0,0);
    this.titikAkhir = new Titik(1,1);
    counterGaris++;
  }

  // Konstruktor Parameter
  public Garis(Titik awal, Titik akhir){
    this.titikAwal = awal;
    this.titikAkhir = akhir;
    counterGaris++;
  }

  // Getter
  public Titik geTitikAwal(){
    return titikAwal;
  }

  public Titik getTitikAkhir(){
    return titikAkhir;
  }

  public static int getCounterGaris(){
    return counterGaris;
  }

  // Setter
  public void setTitikAwal(Titik t) {
    this.titikAwal = new Titik(t.getAbsis(), t.getOrdinat());
  }

  public void setTitikAkhir(Titik t){
    this.titikAkhir = new Titik(t.getAbsis(), t.getOrdinat());
  }

  //

  public double getPanjang(){
    return titikAwal.getJarak(titikAkhir);
  }

  public double getGradien(){
    double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
    double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
    return dy / dx;
  }

  public Titik getTitikTengah(){
    double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
    double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
    return new Titik(midX, midY);
  }

  public boolean isSejajar(Garis g){
    return this.getGradien() == g.getGradien();
  }

  public boolean isTegakLurus(Garis g){
    return (this.getGradien() * g.getGradien()) == -1; 
  }

  public void printGaris(){
    System.out.println("Garis: ");
    titikAwal.printTitik();
    System.out.println(" s/d ");
    titikAkhir.printTitik();
    System.out.println();
  }

  public String getPersamaanGaris(){
    double m = getGradien();
    double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
    return "y = " + m + "x + " + c;
  }
}
