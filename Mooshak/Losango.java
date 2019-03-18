import java.util.Scanner;

public class Losango{

  static void losango(int n){
    int metade = (n-1)/2;

    for(int i = 0; i < metade; i++){
      pontos(metade-i);
      cardinal(2*i+1);
      pontos(metade-i);
      System.out.println("");
    }
    cardinal(n);
    System.out.println("");
    /*
    //versao Bruno
    int i = metade - 1;
    for(int decrescente = n; decrescente - 1 > metade; decrescente--){
      pontos(metade-i);
      cardinal(2*i+1);
      pontos(metade-i);
      System.out.println("");
      i--;
    }
    */
    for(int j = metade - 1; j >= 0 ;j--){
      pontos(metade - j);
      cardinal(2*j+1);
      pontos(metade - j);
      System.out.println("");
    }
  }

  static void pontos(int x){
    if(x == 0)
      System.out.print("");
    else{
      for(int i = 0; i < x; i++)
        System.out.print(".");
    }
  }

  static void cardinal(int z){
    if(z == 0)
      System.out.print("");
    else{
      for(int i = 0; i < z; i++)
        System.out.print("#");
    }
  }

  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);

    int tamanho = stdin.nextInt();
    losango(tamanho);
  }
}
