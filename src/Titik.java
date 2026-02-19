/*  Nama File   : Titik.java
    Desktipsi   : berisi atribut dan method dalam class Titik 
    Pembuat     : Romualdus Yoas Wicaksono
    Tanggal     : 19/02/2026
*/

public class Titik {

    double absis;
    double ordinat;

    //Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //Set absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //Set ordinat titik dengan nilai baru x
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} //end class Titik
    