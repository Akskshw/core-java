class Reverse {
   public static void main(String a[]) {
      String myString = "anna";
      StringBuffer buffer = new StringBuffer(myString);
      buffer.reverse();
      String data = buffer.toString();
      if(myString.equals(data)){
         System.out.println("Given String is palindrome");
      } else {
         System.out.println("Given String is not palindrome");
      }
   }
}