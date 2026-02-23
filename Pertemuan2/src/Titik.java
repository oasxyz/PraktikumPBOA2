/*  NAMA FILE   : Titik.java
    DESKRIPSI   : berisi atribut dan method dalam class Titik
    PEMBUAT     : Romualdus Yoas Wicaksono
    TANGGAL     : 23/02/2026
 */

public class Titik {
    // Atribut
    double absis;
    double ordinat;

    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik() {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }
} //end class Titik
