import java.util.*;

class Teman {
    // atribut 
    private int nbelm;
    private List<String> Lnama;

    // konstruktor
    Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // method
    int getNbelm(){
        return nbelm;
    }

    String getNama(int i){
        return Lnama.get(i);
    }

    void setNama(int i, String nama){
        Lnama.set(i, nama);
    }

    void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    void delNama(String nama){
        if(Lnama.remove(nama)){
            nbelm--;
        }
    }

    boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    void gantiNama(String nama, String namaBaru){
        int idx = Lnama.indexOf(nama);
        if(idx != -1){
            Lnama.set(idx, namaBaru);
        }
    }

    int countNama(String nama){
        int count = 0;
        for(String n : Lnama){
            if(n.equals(n)){
                count++;
            }
        }
        return count;
    }

    // print
    void showTeman(){
        for(String nama : Lnama){
            System.out.println("Nama = " + nama);
        }
    }
}


public class MTeman {
    public static void main(String[] args) throws Exception {
        // kamus
        Teman t;

        // algoritma
        t = new Teman();
        t.addNama("Ciko");
        t.addNama("Coki");
        t.showTeman();
        System.out.println("Banyak Teman: " + t.getNbelm());
    }
}
