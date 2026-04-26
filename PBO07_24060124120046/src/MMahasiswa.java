/*  NAMA FILE   : Coersion.java
    DESKRIPSI   : berisi ad hoc overloading (fungsi sama beda parameter) suatu objek
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 22/04/2026
*/

//BAGIAN II: POLIMORFISME AD HOC OVERLOADING
class Mahasiswa{
    private String NIM;
    private String Nama;
    private String ProgramStudi;

    // KONSTRUKTOR
    Mahasiswa(){
        this.NIM = "999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // OVERLOADING KONSTRUKTOR DENGAN PARAMETER
    Mahasiswa(String NIM, String Nama, String ProgramStudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    // OVERLOADING KONSTRUKTOR DENGAN PARAMETER OBJEK LAIN
    Mahasiswa(Mahasiswa mhs){
        this.Nama = mhs.Nama;
        this.NIM = mhs.NIM;
        this.ProgramStudi = mhs.ProgramStudi;
    }

    // GETTER
    String getNIM(){
        return NIM;
    }

    String getNama(){
        return Nama;
    }

    String getProgramStudi(){
        return ProgramStudi;
    }


    // GETTER
    void setNIM(String nim){
        this.NIM = nim;
    }

    void setNama(String nama){
        this.Nama = nama;
    }

    void setProgramStudi(){
        this.ProgramStudi = "Kosong";
    }

    void setProgramStudi(String prodi){
        this.ProgramStudi = prodi;
    }

    void setProgramStudi(Mahasiswa mhs){
        this.ProgramStudi = mhs.ProgramStudi;
    }

    // PRINTINFO
    void printInfo(){
        System.out.println("NIM: " + NIM + " | " + "Nama: " + Nama + " | " + "Program Studi: " + ProgramStudi);
    }

    
}


public class MMahasiswa {
    public static void main(String[] args) throws Exception {
        

        //IMPLEMENTASI II
        Mahasiswa m1 = new Mahasiswa("24060124120000", "BowTea", "Informatika");
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();
        Mahasiswa m4 = new Mahasiswa("24060124120001", "Rude Dee", "Statistika");
        Mahasiswa m5 = new Mahasiswa(m4);

        m1.printInfo(); 
        m2.printInfo(); //default
        
        m3.setProgramStudi(m1); //copy prodi
        m3.printInfo();

        m5.printInfo(); //copy objek
    }
}
