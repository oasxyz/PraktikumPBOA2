/*  NAMA FILE   : Kendaraan.java
    DESKRIPSI   : berisi atribut dan method dalam class Kendaraan
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 02/03/2026
 */

public class Kendaraan {
  //ATRIBUT
  private String noPlat;
  private String jenisKendaraan;
  
  //METHOD

  //KONSTRUKTOR
  public Kendaraan(){
    this.noPlat = "";
    this.jenisKendaraan = "";
  }

  public Kendaraan(String noPlat, String jenisKendaraan){
    this.noPlat = noPlat;
    this.jenisKendaraan = jenisKendaraan;
  }

  //SELEKTOR
  public String getnoPlat(){
    return noPlat;
  }

  public String getjenisKendaraan(){
    return jenisKendaraan;
  }

  //MUTATOR
  public void setnoPlat(String noPlat){
    this.noPlat = noPlat;
  }

  public void setjenisKendaraan(String jenisKendaraan){
    this.jenisKendaraan = jenisKendaraan;
  }

  public void printKendaraan(){
    System.out.println("Detail Kendaraan:");
    System.out.println("No Plat: " + noPlat);
    System.out.println("Jenis Kendaraan: " + jenisKendaraan);
  }

  
}
