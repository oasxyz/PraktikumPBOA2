import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Pegawai {
  //ATRIBUT
  private String nidn;
  private String fakultas;
  private int bup = 65;

  //KONSTRUKTOR
  public DosenTetap(){

  }

  public DosenTetap(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String nidn, String fakultas){
    super(nip,nama,tglLahir,tmt,gajiPokok);
    this.nidn = nidn;
    this.fakultas = fakultas;
  }

  //SELEKTOR
  public String getNidn(){
    return nidn;
  }

  public String getFakultas(){
    return fakultas;
  }

  //MUTATOR
  public void setNidn(String nidn){
    this.nidn = nidn;
  }

  public void setFakultas(String fakultas){
    this.fakultas = fakultas;
  }

  //PRINT
  @Override
  public void printInfo(){
    LocalDate tglSekarang = LocalDate.of(2025, 3, 10); //MENGAMBIL TANGGAL PADA TAHUN 2025 / BULAN MARET / TANGGAL KE 10
    Period masaKerja = Period.between(getTmt(), tglSekarang); //MENGAMBIL SELISIH DARI TMT DIKURANGI OLEH TANGGAL HARI INI
    int tahunKerja = masaKerja.getYears(); //MENGAMBIL TAHUN DARI SELISIH TMT DAN TANGGAL HARI INI
    int bulanKerja = masaKerja.getMonths(); //MENGAMBIL BULAN DARI SELISIH TMT DAN TANGGAL HARI INI

    LocalDate tglPensiun = getTglLahir().plusYears(bup).plusMonths(1).withDayOfMonth(1);
    double tunjangan = 0.2 * tahunKerja * getGajiPokok();

    System.out.println("NIP             : " + getNip());
    System.out.println("NIDN            : " + nidn);
    System.out.println("Nama            : " + getNama());
    System.out.println("Tanggal Lahir   : " + getTglLahir());
    System.out.println("TMT             : " + getTmt());
    System.out.println("Jabatan         : Dosen Tetap");
    System.out.println("Fakultas        : " + fakultas);
    System.out.println("Masa Kerja      : " + tahunKerja + " tahun " + bulanKerja + " bulan");
    System.out.println("Tanggal Pensiun : " + formatTanggal(tglPensiun));
    System.out.println("Gaji Pokok      : Rp" + (long)getGajiPokok() + ",00");
    System.out.println("Tunjangan       : 2% x " + tahunKerja + " x Rp " + (long)getGajiPokok() + ",00 = Rp" + (long)tunjangan + ",00");
    System.out.println("===============================================");
    
  }
}
