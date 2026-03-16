/*  NAMA FILE   : Tendik.java
    DESKRIPSI   : berisi atribut dan method dari class Tendik
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 12/03/2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
  //ATRIBUT
  private String bidang;
  private int bup = 55;

  //KONSTRUKTOR
  public Tendik(){

  }

  public Tendik(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String bidang){
    super(nip, nama, tglLahir, tmt, gajiPokok);
    this.bidang = bidang;
  }

  @Override
  public void printInfo(){
    LocalDate tglSekarang = LocalDate.of(2025, 3, 10);

    Period masaKerja = Period.between(getTmt(), tglSekarang);
    int tahunKerja = masaKerja.getYears();
    int bulanKerja = masaKerja.getMonths();

    LocalDate tglPensiun = getTglLahir().plusYears(bup).plusMonths(1).withDayOfMonth(1);
    double tunjangan = 0.01 * tahunKerja * getGajiPokok();

    System.out.println("NIP             : " + getNip());
    System.out.println("Nama            : " + getNama());
    System.out.println("Tanggal Lahir   : " + formatTanggal(getTglLahir()));
    System.out.println("TMT             : " + formatTanggal(getTmt()));
    System.out.println("Jabatan         : Tenaga Kependidikan");
    System.out.println("Bidang          : " + bidang);
    System.out.println("Masa Kerja      : " + tahunKerja + " tahun " + bulanKerja + " bulan");
    System.out.println("Tanggal Pensiun : " + formatTanggal(tglPensiun));
    System.out.println("Gaji Pokok      : Rp " + (long)getGajiPokok() + ",00");
    System.out.println("Tunjangan       : 1% x " + tahunKerja + " x Rp " + (long)getGajiPokok() + ",00 = Rp " + (long)tunjangan + ",00");
    System.out.println("--------------------------------------------------");
  }
  
}
