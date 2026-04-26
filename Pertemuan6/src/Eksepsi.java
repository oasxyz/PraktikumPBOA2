public class Eksepsi {
  public static void main(String[] args) {
    int[] arrayInteger = new int[4];
    try{
      arrayInteger[2] = 11;
      arrayInteger[4] = 10;
    }catch(ArrayIndexOutOfBoundsException exception){
      exception.printStackTrace();
    }finally{
      System.out.println("Clean up code...");
    }
  }
}
