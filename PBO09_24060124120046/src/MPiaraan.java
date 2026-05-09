import java.util.*;

// Class Induk
abstract class Anabul {
  // atribut
  private String Nama;
  
  // konstruktor
  Anabul(String nama){
    this.Nama = nama;
  }

  // method
  void setNama(String nama){
    this.Nama = nama;
  }

  String getNama(){
    return Nama;
  }

  abstract String Gerak();

  abstract String Bersuara();

  // print
  void printInfo(){
    System.out.println("Nama: " + Nama + " | Cara Bergerak: " + Gerak() + " | Suara: " + Bersuara());
    System.out.println();
  }
}

// Class Anak
class Kucing extends Anabul{
  // atribut
  private double bobot;

  // konstruktor
  Kucing(String nama, double bobot){
    super(nama);
    this.bobot = bobot;
  }

  // method
  String Gerak(){
    return "Melata";
  }

  String Bersuara(){
    return "Meong";
  }

  void setBobot(double b){
    this.bobot = b;
  }

  double getBobot(){
    return this.bobot;
  }

  // print
  @Override
  void printInfo(){
    System.out.println("INI KUCING");
    System.out.println("BOBOT: " + bobot + "kg");
    super.printInfo();
  }
}

class Anjing extends Anabul{
  // atribut

  // konstruktor
  Anjing(String nama){
    super(nama);
  }

  // method
  String Gerak(){
    return "Melata";
  }

  String Bersuara(){
    return "Guk-guk";
  }

  // print
  @Override
  void printInfo(){
    System.out.println("INI ANJING");
    super.printInfo();
  }
}

class Burung extends Anabul{
  // atribut

  // konstruktor
  Burung(String nama){
    super(nama);
  }

  String Gerak(){
    return "Terbang";
  }

  String Bersuara(){
    return "Cuit";
  }

  // print
  @Override
  void printInfo(){
    System.out.println("INI BURUNG");
    super.printInfo();
  }
}

//class turunan kucing
class Anggora extends Kucing{
  // atribut

  // konstruktor
  Anggora(String nama, double bobot){
    super(nama, bobot);
  }
}

class Kembangtelon extends Kucing{
  // atribut

  // konstruktor
  Kembangtelon(String nama, double bobot){
    super(nama, bobot);
  }
}

class Piaraan{
  // atribut
  private int nbelm;
  private ArrayList<Anabul> Lanabul;

  // konstruktor
  Piaraan(){
    nbelm = 0;
    Lanabul = new ArrayList<>();
  }

  // method
  int getNbelm(){
    return nbelm;
  }

  Anabul getAnabul(){
    return Lanabul.get(0);
  }

  void enqueueAnabul(Anabul anabul){
    Lanabul.add(anabul);
    nbelm++;
  }

  void dequeueAnabul(){
    if(Lanabul.size() > 0){
      Lanabul.remove(0);
      nbelm--;
    }
  }

  boolean isMember(Anabul anabul){
    return Lanabul.contains(anabul);
  }

  int countKucing(){
    int count = 0;
    for(Anabul a : Lanabul){
      if(a instanceof Kucing){
        count++;
      }
    }
    return count;
  }

  double bobotKucing(){
    double bobot = 0;
    for(Anabul a : Lanabul){
      if(a instanceof Kucing){
        bobot = bobot + ((Kucing)a).getBobot();
      }
    }
    return bobot;
  }

  // print
  void showJenisAnabul(){
    for(Anabul a : Lanabul){
      System.out.println("Class = " + a.getClass() + " | Nama = " + a.getNama());
    }
  }

}


public class MPiaraan {
  public static void main(String[] args) {
    // kamus
    Piaraan P;

    // algoritma
    P = new Piaraan();
    P.enqueueAnabul(new Anjing("Cuki"));
    P.enqueueAnabul(new Kucing("Coki", 1.5));
    P.enqueueAnabul(new Kucing("Salom Kurniawan", 65));

    P.showJenisAnabul();
    System.out.println("Banyak Kucing = " + P.countKucing());
    System.out.println("Bobot Kucing = " + P.bobotKucing());
  }  
}
