/*  NAMA FILE   : MClass.java
    DESKRIPSI   : berisi Main class dari class BangunDatar, Persegi dan Lingkaran
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 16/03/2026
*/

public class MClassBD {
  public static void main(String[] args) {
    Persegi P1 = new Persegi(4, "HITAM", "NONE");
    Lingkaran L1 = new Lingkaran(8, "PUTIH", "NONE");

    // BangunDatar B1 = new BangunDatar();
    // BangunDatar P1 = new Persegi(10);
    // Persegi P2 = new Persegi(5);
    // BangunDatar L1 = new Lingkaran(7);
    // Lingkaran L1 = new Lingkaran(14)

    P1.printInfo();
    System.out.println("Luas: " + P1.getLuas());
    System.out.println("Keliling: " + P1.getKeliling());
    System.out.println("Diagonal: " + P1.getDiagonal());
    System.out.println();
    L1.printInfo();
    System.out.println("Luas: " + L1.getLuas());
    System.out.println("Keliling: " + L1.getKeliling());
  }

}
