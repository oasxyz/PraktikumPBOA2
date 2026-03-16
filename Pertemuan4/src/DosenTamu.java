/*  NAMA FILE   : DosenTamu.java
    DESKRIPSI   : berisi atribut dan method dari class DosenTamu
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 12/03/2026
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Pegawai {
  //ATRIBUT
  private String nidk;
  private String fakultas;
  private LocalDate tglBerakhirKontrak;
  
  //KONSTRUKTOR
  public DosenTamu(){

  }

  public DosenTamu(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String nidk, String fakultas, LocalDate tglBerakhirKontrak){
    super(nip,nama,tglLahir,tmt,gajiPokok);
    this.nidk = nidk;
    this.fakultas = fakultas;
    this.tglBerakhirKontrak = tglBerakhirKontrak;
  }

  //SELEKTOR
  public String getNidk(){
    return nidk;
  }

  public String getFakultas(){
    return fakultas;
  }

  public LocalDate tglBerakhirKontrak(){
    return tglBerakhirKontrak;
  }


  //MUTATOR
  public void setNidk(String nidk){
    this.nidk = nidk;
  }

  public void setFakultas(String fakultas){
    this.fakultas = fakultas;
  }

  public void setTglBerakhirKontrak(LocalDate tglBerakhirKontrak){
    this.tglBerakhirKontrak = tglBerakhirKontrak;
  }

  //PRINT
  @Override
  public void printInfo(){
    LocalDate tglSekarang = LocalDate.of(2025, 3, 10);
    Period masaKerja = Period.between(getTmt(), tglSekarang);

    //hitung sisa kontrak dalam bulan
    Period sisaWaktu = Period.between(tglSekarang, tglBerakhirKontrak);
    int sisaBulan = (sisaWaktu.getYears() * 12) + sisaWaktu.getMonths();

    double tunjangan = 0.025 * getGajiPokok();

    System.out.println("NIP             : " + getNip());
    System.out.println("NIDK            : " + nidk);
    System.out.println("Nama            : " + getNama());
    System.out.println("Tanggal Lahir   : " + formatTanggal(getTglLahir()));
    System.out.println("TMT             : " + formatTanggal(getTmt()));
    System.out.println("Jabatan         : Dosen Tamu");
    System.out.println("Fakultas        : " + fakultas);
    System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
    System.out.println("Sisa Kontrak    : " + sisaBulan + " bulan");
    System.out.println("Gaji Pokok      : Rp " + (long)getGajiPokok() + ",00");
    System.out.println("Tunjangan       : 2.5% x Rp " + (long)getGajiPokok() + ",00 = Rp " + (long)tunjangan + ",00");
    System.out.println("--------------------------------------------------");
  }
  
}
