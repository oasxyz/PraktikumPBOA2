/*  NAMA FILE   : Lingkaran.java
    DESKRIPSI   : berisi class atribut dan method dalam class Lingkaran
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 09/03/2026
 */

public class MClass {
  public static void main(String[] args) {
    Persegi P1 = new Persegi(4, "HITAM", "NONE");
    Lingkaran L1 = new Lingkaran(8, "PUTIH", "NONE");

    P1.printInfo();
    System.out.println("Luas: " + P1.getLuas());
    System.out.println("Keliling: " + P1.getKeliling());
    System.out.println("Diagonal: " + P1.getDiagonal());
    L1.printInfo();
    System.out.println("Luas: " + L1.getLuas());
    System.out.println("Keliling: " + L1.getKeliling());
  }

}
