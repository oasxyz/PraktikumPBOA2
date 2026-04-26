/*  NAMA FILE   : MCivitasakademika.java
    DESKRIPSI   : berisi implementasi POLIMORFISME UNIVERSAL INCLUSION
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 22/04/2026
*/

// Class Induk
class Civitasakademika{
  private String nama;

  //constructor
  Civitasakademika(String nama){
    this.nama = nama;
  }

  //setter
  void setNama(String nama){
    this.nama = nama;
  }

  //getter
  String getNama(){
    return nama;
  }

  String getNomor(){
    return "-";
  }

  //printinfo
  void printInfo(){

  }
}

// Class Anak
class Dosen extends Civitasakademika{
  private String NIP;

  //constructor
  Dosen(String nama, String NIP){
    super(nama);
    this.NIP = NIP;
  }

  //setter
  void setNip(String nip){
    this.NIP = nip;
  }

  //getter
  @Override
  String getNomor(){
    return NIP;
  }

  //printinfo
  @Override
  void printInfo(){
    System.out.println("DATA DOSEN:");
    System.out.println("Nama: " + getNama() + " | NIP: " + NIP);
    System.out.println();
  }
}

class Mahasiswaa extends Civitasakademika{
  private String NIM;
  private Dosen dosenWali;

  //constructor
  Mahasiswaa(String nama, String NIM){
    super(nama);
    this.NIM = NIM;
  }

  //setter
  void setNim(String nim){
    this.NIM = nim;
  }

  void setdosenWali(Dosen dosenwali){
    this.dosenWali = dosenwali;
  }

  //getter
  @Override
  String getNomor(){
    return NIM;
  }

  Dosen getDosenWali(){
    return dosenWali;
  }

  //printinfo
  @Override
  void printInfo(){
    System.out.println("DATA MAHASISWA:");
    System.out.println("Nama: " + getNama() + " | NIM: " + NIM + " | Dosen Wali: " + dosenWali.getNama());
    System.out.println();
  }

}

// Class Seminar
class Seminar {
  Civitasakademika[] peserta = new Civitasakademika[100];
  int banyakPeserta;

  Seminar(){
    banyakPeserta = 0;
  }

  void registrasi(Civitasakademika c){
    peserta[banyakPeserta++] = c;
  }

  int countPeserta(){
    return banyakPeserta;
  }

  void printPeseta(){
    System.out.println("DATA PESERTA SEMINAR:");
    for(int i = 0; i < banyakPeserta; i++){
      System.out.println("Nomor Induk: " + peserta[i].getNomor() + ", Nama: " + peserta[i].getNama());
    }
  }

  int countMahasiswa(){
    int count = 0;
    for(int i = 0; i < banyakPeserta; i++){
      if(peserta[i] instanceof Mahasiswaa){
        count++;
      }
    }
    return count;
  }
}

public class MCivitasakademika {
  public static void main(String[] args) {
    
    Dosen d1 = new Dosen("Pak Wowo", "199203152021041003");
    Dosen d2 = new Dosen("Ibu Lestari", "198710252022071207");

    Mahasiswaa m1 = new Mahasiswaa("Chiko Aminudin", "202410201001");
    Mahasiswaa m2 = new Mahasiswaa("Rahmat Saroempaet", "202410201002");
    Mahasiswaa m3 = new Mahasiswaa("Muhammad Rudi", "202410201003");
    Mahasiswaa m4 = new Mahasiswaa("Jono Mulawarman", "202410201004");
    Mahasiswaa m5 = new Mahasiswaa("Widodo Banjarsari", "202410201005");

    m1.setdosenWali(d1);
    m2.setdosenWali(d1);
    m3.setdosenWali(d1);
    m4.setdosenWali(d2);
    m5.setdosenWali(d2);

    Seminar s = new Seminar();

    s.registrasi(d1);
    s.registrasi(d2);
    s.registrasi(m1);
    s.registrasi(m2);
    s.registrasi(m3);
    s.registrasi(m4);
    s.registrasi(m5);

    s.printPeseta();
    System.out.println("Jumlah Mahasiswa: " + s.countMahasiswa());

    m1.printInfo();
  }
}


