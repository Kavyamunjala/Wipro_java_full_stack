class Powerint{
   Caliculator() {
   }

   public static int powerInt(int var0, int var1) {
      int var2 = 1;

      for(int var3 = 1; var3 <= var1; ++var3) {
         var2 *= var0;
      }

      return var2;
   }

   public static void main(String[] var0) {
      byte var1 = 2;
      byte var2 = 5;
      int var3 = powerInt(var1, var2);
      System.out.println(var3);
   }
}
