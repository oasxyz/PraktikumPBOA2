public class Dosen {
  //ATRIBUT
  private String nip;
  private String nama;
  private String prodi;

  //METHOD

  //KONSTRUKTOR
  public Dosen(){
    this.nip = "";
    this.nama = "";
    this.prodi = "";
  }

  public Dosen(String nip, String nama, String prodi){
    this.nip = nip;
    this.nama = nama;
    this.prodi = prodi;
  }

  //SELEKTOR
  public String getnipDosen(){
    return nip;
  }

  public String getnamaDosen(){
    return nama;
  }

  public String getprodiDosen(){
    return prodi;
  }

  //MUTATOR
  public void setnipDosen(String nip){
    this.nip = nip;
  }

  public void setnamaDosen(String nama){
    this.nama = nama;
  }

  public void setprodiDosen(String prodi){
    this.prodi = prodi;
  }

  public void printDosen(){
    System.out.println("Nip: " + nip);
    System.out.println("Nama: " + nama);
    System.out.println("Prodi: " + prodi);
  }


}
