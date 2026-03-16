/*  NAMA FILE   : BangunDatar.java
    DESKRIPSI   : berisi class atribut dan method dalam class BangunDatar
    PEMBUAT     : Romualdus Yoas Wicaksono
    NIM         : 24060124120046
    TANGGAL     : 09/03/2026
*/

public class BangunDatar {
    //ATRIBUT
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;


    //METHOD
    //KONSTRUKTOR
    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }


   //MUTATOR
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }


    //SELEKTOR
    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    
    public String getBorder(){
        return border;
    }

    
    //PRINT
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}
