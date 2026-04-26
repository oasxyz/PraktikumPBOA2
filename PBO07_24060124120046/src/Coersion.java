/*  NAMA FILE   : Coersion.java
    DESKRIPSI   : berisi ad hoc coersion (konversi atau casting) suatu objek
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 22/04/2026
*/

// BAGIAN I: POLIMORFISME AD HOC COERSION
public class Coersion {
  public static void main(String[] args) {
    // a
    System.out.println("BAGIAN A:");
    // kamus
    int nilai;

    // algoritma
    nilai = 65;
    char c = (char)nilai;
    double d = nilai;

    System.out.println("nilai awal integer: " + nilai);
    System.out.println("nilai konversi double: " + d);
    System.out.println("nilai konversi char: " + c);
    System.out.println();

    // b
    System.out.println("BAGIAN B:");
    // kamus
    int nilaiAsli;
    double nilaiDouble;
    int hasilKonversi;

    // algoritma
    nilaiAsli = 67;
    nilaiDouble = nilaiAsli;
    hasilKonversi = (int)nilaiDouble;

    System.out.println("nilai awal: " + nilaiAsli);
    System.out.println("nilai dikonversi double: " + nilaiDouble);
    System.out.println("nilai dikonversi kembali ke integer: " + hasilKonversi);
    System.out.println();

    // c
    System.out.println("BAGIAN C:");
    // kamus
    String X, Y, S;
    int Z;

    // algoritma
    X = "1234";
    Y = "5678";
    S = X + Y;
    Z = Integer.parseInt(X) + Integer.parseInt(Y);
    System.out.println("X: " + X);
    System.out.println("Y: " + Y);
    System.out.println("Hasil Concat X,Y: " + S);
    System.out.println("Hasil Penjumlahan X, Y: " + Z);
    System.out.println();

    // d
    System.out.println("BAGIAN D");
    // kamus
    String P, Q, R;
    double D;

    // algoritma
    P = "12.34";
    Q = "56.78";
    R = P + Q;
    D = Double.parseDouble(P) + Double.parseDouble(Q);
    System.out.println("P: " + P);
    System.out.println("Q: " + Q);
    System.out.println("Hasil Concat P,Q: " + R);
    System.out.println("Hasil Penjumlahan P,Q: " + D);
    System.out.println();

    // e
    System.out.println("BAGIAN E");
    // kamus
    String Sn;
    int A; 

    // algoritma
    Sn = "67";
    A = Integer.valueOf(Sn);
    System.out.println("Nilai Sekarang: " + Sn);
    System.out.println("Hasil Konversi: " + A);
    System.out.println();

    // f
    System.out.println("BAGIAN F");
    // kamus
    String T;
    
    // algoritma
    T = String.valueOf(A);
    System.out.println("Nilai Sekarang: " + A);
    System.out.println("Hasil Konversi: " + T);
    if(T instanceof String){
      System.out.println("nilai merupakan string.");
    }
    System.out.println();
  }
}
