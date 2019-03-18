import java.util.Scanner;

public class Palindromo{
  static String format(String s){
    return s.replaceAll("\\W", "").replaceAll("\\d", "").toLowerCase();
  }

  static void Palindromo(String s){
    s = format(s);

    String reverse = "";

    for(int i = s.length() - 1; i >= 0; i--)
      reverse = reverse + s.charAt(i);

    if(s.equals(reverse))
      System.out.println("sim");
    else
      System.out.println("nao");
  }

  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);

    int n = stdin.nextInt();
    stdin.nextLine();

    System.out.println(n);

    for(int i = 0; i < n; i++){
      String s = stdin.nextLine();
      Palindromo(s);
    }

    stdin.close();
  }
}
