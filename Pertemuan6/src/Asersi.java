public class Asersi {
    public static void main(String[] args) throws Exception {
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }else{
            assert(x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
