class DilemmaEQ {
   public static void main(String args[]) {
      String s1 = new String("REF-COMP");
      String s2 = new String("REF-COMP");
      // Reference comparison
      System.out.println(s1 == s2);
      // Content comparison
      System.out.println(s1.equals(s2));
      // char-type
      System.out.println('a' == 'a');
      // Output
      // false
      // true
      // true
   }
}
