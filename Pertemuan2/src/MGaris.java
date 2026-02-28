/*  NAMA FILE   : Garis.java
    DESKRIPSI   : berisi atribut dan method dalam class Garis
    PEMBUAT     : Romualdus Yoas Wicaksono
    TANGGAL     : 24/02/2026
 */

public class MGaris {
  public static void main(String[] args){
    Titik T1 = new Titik(-2,0);
    System.out.println("T1: ");
    T1.printTitik();
    Titik T2 = new Titik(4, 0);
    System.out.println("T2: ");
    T2.printTitik();
    
    System.out.println();
    Garis G1 = new Garis(T1, T2);
    G1.printGaris();

    System.out.println("Panjang G1: " + G1.getPanjang());
    System.out.println("Gradien G1: " + G1.getGradien());

    System.out.println();

    Titik tengah = G1.getTitikTengah();
    System.out.println("Titik Tengah G1: ");
    tengah.printTitik();

    System.out.println("Persamaan G1: " + G1.getPersamaanGaris());

    Garis G2 = new Garis(new Titik(0,0), new Titik(2,4));
    System.out.println("G1 Sejajar dengan G2? " + G1.isSejajar(G2));

    System.out.println("Jumlah Garis yang dibuat: " + Garis.getCounterGaris());
  }
}
