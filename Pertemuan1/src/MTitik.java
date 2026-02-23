public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik(); 
        T1.geser(2, -1);
        T1.printTitik();
    }
}