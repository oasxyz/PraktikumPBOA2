/*  NAMA FILE   : Titik.java
    DESKRIPSI   : berisi atribut dan method dalam class Titik
    PEMBUAT     : Romualdus Yoas Wicaksono
    TANGGAL     : 23/02/2026
 */

public class Titik {
    // Atribut
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    static int getcounterTitik() {
        return counterTitik;
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

    int getKuadran() {
        if(this.absis > 0 && this.ordinat > 0){
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0){
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0){
            return 3;
        } else if(this.absis > 0 && this.ordinat < 0){
            return 4;
        } else{
            return 0;
        }
    }

    void refleksiX() {
        this.ordinat = this.ordinat * -1;
    }

    void refleksiY() {
        this.absis = this.absis * -1;
    }

    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    double getJarakPusat() {
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    double getJarak(Titik T){
        double dAbsis = this.absis - T.absis;
        double dOrdinat = this.ordinat - T.ordinat;

        return Math.sqrt((dAbsis * dAbsis) + (dOrdinat * dOrdinat));
    }

    void printTitik() {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }
} //end class Titik
