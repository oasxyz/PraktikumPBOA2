public class MataKuliah {
  //ATRIBUT
  private String idMatkul;
  private String namaMatkul;
  private int sks;

  //METHOD

  //KONSTRUKTOR
  public MataKuliah(){
    this.idMatkul = "";
    this.namaMatkul = "";
    this.sks = 0;
  }

  public MataKuliah(String idMatkul, String namaMatkul, int sks){
    this.idMatkul = idMatkul;
    this.namaMatkul = namaMatkul;
    this.sks = sks;
  }

  //SELECTOR
  public String getidMatkul(){
    return idMatkul;
  }

  public String getnamaMatkul(){
    return namaMatkul;
  }

  public int getSks(){
    return sks;
  }

  //MUTATOR
  public void setidMatkul(String idMatkul){
    this.idMatkul = idMatkul;
  }

  public void setnamaMatkul(String namaMatkul){
    this.namaMatkul = namaMatkul;
  }

  public void setSks(int sks){
    this.sks = sks;
  }

  //PRINT
  public void printMatkul(){
    System.out.println("ID Matkul: " + idMatkul);
    System.out.println("Nama Matkul: " + namaMatkul);
    System.out.println("Bobot SKS: " + sks);
  }
}


