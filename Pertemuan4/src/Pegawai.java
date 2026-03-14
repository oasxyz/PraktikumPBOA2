import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
  //ATRIBUT
  private String nip;
  private String nama;
  private LocalDate tglLahir;
  private LocalDate tmt;
  private double gajiPokok;

  //KONSTRUKTOR
  public Pegawai(){

  }

  public Pegawai(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok){
    this.nip = nip;
    this.nama = nama;
    this.tglLahir = tglLahir;
    this.tmt = tmt;
    this.gajiPokok = gajiPokok;
  }


  //SELECTOR
  public String getNip(){
    return nip;
  }

  public String getNama(){
    return nama;
  }

  public LocalDate getTglLahir(){
    return tglLahir;
  }

  public LocalDate getTmt(){
    return tmt;
  }

  public double getGajiPokok(){
    return gajiPokok;
  }
  
  public String getNamaBulan(int bulan){
    String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    return namaBulan[bulan];
  }

  //MUTATOR
  public void setNip(String nip){
  this.nip = nip;
}

  public void setNama(String nama){
    this.nama = nama;
  }

  public void setTglLahir(LocalDate tglLahir){
    this.tglLahir = tglLahir;
  }

  public void setTmt(LocalDate tmt){
    this.tmt = tmt;
  }

  public void setGajiPokok(double gajiPokok){
    this.gajiPokok = gajiPokok;
  }

  public String formatTanggal(LocalDate tgl){
    return tgl.getDayOfMonth() + " " + getNamaBulan(tgl.getMonthValue()) + " " + tgl.getYear();
  }

  public void printInfo(){
  }
}
