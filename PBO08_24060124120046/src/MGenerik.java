/*  NAMA FILE   : MGenerik.java
    DESKRIPSI   : berisi implementasi POLIMORFISME UNIVERSAL INCLUSION
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 24/04/2026
*/

// Class Induk
abstract class Anabul {
  private String Nama;
  
  Anabul(String nama){
    this.Nama = nama;
  }

  void setNama(String nama){
    this.Nama = nama;
  }
  String getNama(){
    return Nama;
  }

  abstract String Gerak();

  abstract String Bersuara();

  void printInfo(){
    System.out.println("Nama: " + Nama + " | Cara Bergerak: " + Gerak() + " | Suara: " + Bersuara());
    System.out.println();
  }
}

// Class Anak
class Kucing extends Anabul{
  private double bobot;


  Kucing(String nama, double bobot){
    super(nama);
    this.bobot = bobot;
  }

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

  @Override
  void printInfo(){
    System.out.println("INI KUCING");
    System.out.println("BOBOT: " + bobot + "kg");
    super.printInfo();
  }
}

class Anjing extends Anabul{

  Anjing(String nama){
    super(nama);
  }

  String Gerak(){
    return "Melata";
  }

  String Bersuara(){
    return "Guk-guk";
  }

  @Override
  void printInfo(){
    System.out.println("INI ANJING");
    super.printInfo();
  }
}

class Burung extends Anabul{

  Burung(String nama){
    super(nama);
  }

  String Gerak(){
    return "Terbang";
  }

  String Bersuara(){
    return "Cuit";
  }

  @Override
  void printInfo(){
    System.out.println("INI BURUNG");
    super.printInfo();
  }
}

//class turunan kucing
class Anggora extends Kucing{
  Anggora(String nama, double bobot){
    super(nama, bobot);
  }
}

class Kembangtelon extends Kucing{
  Kembangtelon(String nama, double bobot){
    super(nama, bobot);
  }
}


// Class Datum
class Datum<T> {
  private T isi;

  Datum(T isi) {
    this.isi = isi;
  }

  T getIsi(){
    return isi;
  }

  void setIsi(T isi){
    this.isi = isi;
  }
}

// OperatorGenerik
class OperatorGenerik {
  static <T> void Tukar(Datum<T> a, Datum<T> b) {
    T temp = a.getIsi();
    a.setIsi(b.getIsi());
    b.setIsi(temp);
  }

  static <T extends Kucing> double Bobot2(T k1, T k2) {
    return k1.getBobot() + k2.getBobot();
  }
}

// Larik Generik
class Data<T> {
  private T[] ruang;
  private int banyak;

  Data() {
    ruang = (T[]) new Object[100];
    banyak = 0; 
  }

  void setIsi(int posisi, T objek) {
    if(posisi >= 1 && posisi <= 100){
      if(ruang[posisi - 1] == null) {
        banyak++;
      }
      ruang[posisi - 1] = objek;
    }
  }

  T getIsi(int posisi){
    if(posisi >= 1 && posisi <= 100) {
      return ruang[posisi - 1];
    }
    return null;
  }

  int getSize() {
    return banyak;
  }
}

public class MGenerik {
  public static void main(String[] args) {
    Anabul[] hewan = {
      new Kucing("Yuki", 2.0),
      new Anjing("Max"),
      new Burung("Bejo")
    };

    Datum<Anabul> d1 = new Datum<>(new Kucing("Jack", 3.5));
    Datum<Anabul> d2 = new Datum<>(new Kucing("Lilo", 3.8));

    System.out.println("=== REALISASI ANABUL ===");
    
    //test update bobot
    ((Kucing) hewan[0]).setBobot(2.5);

    //print
    hewan[0].printInfo();
    hewan[1].printInfo();
    hewan[2].printInfo();
    

   
    //test update bobot
    ((Kucing) d1.getIsi()).setBobot(3.7);

    //print
    d1.getIsi().printInfo();
    d2.getIsi().printInfo();


    // REALISASI OPERATORGENERIK
    System.out.println();
    System.out.println("=== REALISASI OPERATOR GENERIK ===");
    Datum<Integer> a = new Datum<>(3);
    Datum<Integer> b = new Datum<>(6);

    System.out.println("SEBELUM DITUKAR: ");
    System.out.println("a = " + a.getIsi());
    System.out.println("b = " + b.getIsi());

    OperatorGenerik.Tukar(a,b);

    System.out.println("SESUDAH DITUKAR:");
    System.out.println("a = " + a.getIsi());
    System.out.println("b = " + b.getIsi());

    Datum <Anabul> x = new Datum<>(new Kucing("Coki", 2.8));
    Datum <Anabul> y = new Datum<>(new Anjing("Ciko"));

    System.out.println();

    System.out.println("SEBELUM TUKAR ANABUL: ");
    x.getIsi().printInfo();
    y.getIsi().printInfo();

    OperatorGenerik.Tukar(x,y);

    System.out.println("SESUDAH TUKAR ANABUL: ");
    x.getIsi().printInfo();
    y.getIsi().printInfo();



    // REALISASI BOBOT2
    System.out.println("=== REALISASI BOBOT2 ===");

    Datum<Kucing> k1 = new Datum<>(new Anggora("Coki", 2.5));
    Datum<Kucing> k2 = new Datum<>(new Kembangtelon("Ciko", 2.5));
    double totalBobot = OperatorGenerik.Bobot2(k1.getIsi(), k2.getIsi());

    System.out.println("Bobot kucing k1: " + k1.getIsi().getBobot());
    System.out.println("Bobot Kucing k2: " + k2.getIsi().getBobot());
    System.out.println("Total Bobot Dua Kucing k1 + k2 = " + totalBobot + "kg");


    // REALISASI DATA (LARIK GENERIK)
  }
}
