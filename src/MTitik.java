/*  Nama File   : MTitik.java
    Desktipsi   : berisi atribut dan method dalam class Titik 
    Pembuat     : Romualdus Yoas Wicaksono
    Tanggal     : 19/02/2026
*/

public class MTitik {
  public static void main(String[] args) {
    Titik T1 = new Titik(); //membuat objek titik T1 (0,0)
    T1.setAbsis(3);
    T1.setOrdinat(4);
    T1.printTitik();
    T1.geser(2, 4);
    T1.printTitik();
  }
}
