/*  NAMA FILE   : Titik.java
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
  }
}
