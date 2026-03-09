/*  NAMA FILE   : Mahasiswa.java
    DESKRIPSI   : berisi class atribut dan method dalam class Mahasiswa
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 02/03/2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /* ATRIBUT */
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* METHOD */
    /* KONSTRUKTOR */
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>(); //inisialisasi list mata kuliah kosong
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>(); 
    }
    

    /* SELEKTOR */
    public String getNim(){
        return nim;
    }

    public String getnamaMhs(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getdosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    // public ArrayList<String> getNamaMatkul() {
    //     ArrayList<String> daftarNama = new ArrayList<>();
    //     for(MataKuliah mk : listMatKul){
    //         daftarNama.add(mk.getnamaMatkul());
    //     }
    //     return daftarNama;
    // }

    public int getJumlahMatkul(){
        return listMatKul.size();
    }

    public int getJumlahSks(){
        int total = 0;
        for(MataKuliah mk : listMatKul){
            total = total + mk.getSks();
        }
        return total;
    }


    /* MUTATOR */
    public void setNimMhs(String nim){
        this.nim = nim;
    }

    public void setNamaMhs(String nama){
        this.nama = nama;
    }

    public void setProdiMhs(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen d){
        this.dosenWali = d;
    }

    public void setKendaraan(Kendaraan k){
        this.kendaraan = k;
    }

    public void addMatkul (MataKuliah newMatkul) {
        if(listMatKul.size() < 50){
            listMatKul.add(newMatkul);
        }
    }


    /* PRINT */
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        
        System.out.println("Daftar Mata Kuliah yang Diambil: ");
        for(int i = 0; i < listMatKul.size(); i++){
            System.out.println("- " + listMatKul.get(i).getnamaMatkul());
        }

        System.out.println("Jumlah Mata Kuliah: " + listMatKul.size());
        System.out.println("Total SKS: " + getJumlahSks());

        if(dosenWali != null){
            System.out.println("Dosen Wali: " + dosenWali.getnamaDosen());
        }

        if(kendaraan != null){
            System.out.println("Kendaraan: " + kendaraan.getjenisKendaraan() + ", No Plat: " + kendaraan.getnoPlat()) ;
        }
        
    }
}
