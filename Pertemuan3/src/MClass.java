public class MClass {
  public static void main(String[] args) {
    System.out.println("=== INISIALISASI KENDARAAN ===");
    System.out.println("S1: ");
    Kendaraan S1 = new Kendaraan("H 777 AP", "Motor");
    System.out.println("No Plat: " + S1.getnoPlat());
    System.out.println("Jenis Kendaraan: " + S1.getjenisKendaraan());

    System.out.println();

    System.out.println("S2: ");
    Kendaraan S2 = new Kendaraan();
    S2.setjenisKendaraan("Mobil");
    S2.setnoPlat("B 888 UJ");
    S2.printKendaraan();

    System.out.println();

    System.out.println("=== INISIALISASI DOSEN ===");
    Dosen D1 = new Dosen("217741", "Prabobski Subianti", "Informatika");
    System.out.println("D1: ");
    D1.printDosen();

    System.out.println();

    Dosen D2 = new Dosen();
    D2.setnipDosen("217742");
    D2.setnamaDosen("Mulyono Tjakrawijaya");
    D2.setprodiDosen("Teknik Kehutanan");
    System.out.println("D2: ");
    System.out.println("Nip: " + D2.getnipDosen());
    System.out.println("Nama: " + D2.getnamaDosen());
    System.out.println("Prodi: " + D2.getprodiDosen());

    System.out.println();

    System.out.println("=== INISIALISASI MATAKULIAH ===");
    MataKuliah MK1 = new MataKuliah("MK1", "Pendidikan Moral dan Etika", 3);
    MataKuliah MK2 = new MataKuliah();
    MK2.setidMatkul("MK2");
    MK2.setnamaMatkul("Pemrograman Tingkat Lanjut");
    MK2.setSks(4);

    MK1.printMatkul();
    System.out.println();
    MK2.printMatkul();

    System.out.println();

    System.out.println("=== INISIALISASI MAHASISWA ===");
    System.out.println("Mahasiswa 1: ");
    Mahasiswa M1 = new Mahasiswa("24060124120046", "Romualdus Yoas W", "Informatika");
    M1.addMatkul(MK2);
    M1.setDosenWali(D1);
    M1.setKendaraan(S1);
    M1.printDetailMhs();
    System.out.println();
  }
}
