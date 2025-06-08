public class Fibonacci {
   public Fibonacci() {
   }

   public static void main(String[] var0) {
      byte var1 = 10;
      int var2 = 6;
      int var3 = 1;
      System.out.println("Fibonacci Serice upto" + var1 + "term");

      for(int var4 = 1; var4 <= var1; ++var4) {
         System.out.println("" + var2 + " ");
         int var5 = var2 + var3;
         var2 = var3;
         var3 = var5;
      }
    }
    
}
