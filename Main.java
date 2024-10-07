public class Main
{
  public static String LastFirstN(String s1, String s2, int n) {
    String lastS1 = s1.substring(s1.length() - n); // fix this later
    String firstS2 = s2.substring(0, n);
    String concatted = lastS1 + firstS2;
    return concatted;
  }
  public static void stringManip() {
    String msg = new String("hello");
    String first = msg.substring(0, 1); // get the first
    String rest = msg.substring(1); // get the rest
    first = first.toUpperCase();
    String concatted = first + rest;
    System.out.print(concatted);
  }
  public static void main(String[] args)
  {
    String testy = LastFirstN("cream", "butter", 3);
    String testy1 = LastFirstN("superman", "peee", 3);
    System.out.println(testy);
    System.out.println(testy1);
    stringManip();
    // write your code here
  }
}
