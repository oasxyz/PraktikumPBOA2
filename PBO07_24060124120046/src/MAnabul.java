/*  NAMA FILE   : MAnabul.java
    DESKRIPSI   : berisi implementasi POLIMORFISME UNIVERSAL INCLUSION
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 22/04/2026
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

  Kucing(String nama){
    super(nama);
  }

  String Gerak(){
    return "Melata";
  }

  String Bersuara(){
    return "Meong";
  }

  @Override
  void printInfo(){
    System.out.println("INI KUCING");
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


public class MAnabul {
  public static void main(String[] args) {
    Anabul[] hewan = {
      new Kucing("Yuki"),
      new Anjing("Max"),
      new Burung("Bejo")
    };


    hewan[0].printInfo();
    hewan[1].printInfo();
    hewan[2].printInfo();
  }
}
