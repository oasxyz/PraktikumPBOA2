/*  NAMA FILE   : MTitik.java
    DESKRIPSI   : berisi atribut dan method dalam class Titik
    PEMBUAT     : Romualdus Yoas Wicaksono
    TANGGAL     : 23/02/2026
 */

public class MTitik {
  public static void main(String[] args) {
    Titik T1 = new Titik();
    T1.setAbsis(3);
    T1.setOrdinat(4);
    T1.printTitik();
    T1.geser(3, 4);
    T1.printTitik();

    Titik T2 = T1;
    T2.printTitik();
    T1.setAbsis(10);
    T1.setOrdinat(10);
    T2.printTitik();

    Titik T3 = new Titik();
    T3.setAbsis(2);
    T3.setOrdinat(4);
    T3.printTitik();

    Titik T4 = T3.getRefleksiX();
    T4.printTitik();    
    System.out.println("Jumlah Titik: " + T4.getcounterTitik());
  }
}