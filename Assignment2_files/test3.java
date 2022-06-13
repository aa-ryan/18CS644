import java.util.Arrays;
import java.util.Comparator;

class MyComparator implements Comparator<String> {
  public int compare(String strA, String strB) {
    return strA.compareToIgnoreCase(strB);
  }
}

class Main {
  public static void main(String[] argv) throws Exception {
    String strs[] = { "a", "A", "b", "C", "d"};

    MyComparator icc = new MyComparator();

    Arrays.sort(strs, icc.reversed());

    for (String s : strs) {
      System.out.print(s + " ");
    }
    System.out.println();
    Arrays.sort(strs);

    System.out.print("Default, case-sensitive sorted order: ");
    for (String s : strs) {
      System.out.print(s + " ");
    }
    System.out.println();

    Arrays.sort(strs, icc);

    System.out.print("Default, case-insensitive sorted order: ");
    for (String s : strs) {
      System.out.print(s + " ");
    }
    System.out.println();
  }
}

