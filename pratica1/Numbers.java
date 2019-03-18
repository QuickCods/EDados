// Uma classe muito simples que usa um ciclo para imprimir numeros entre 1 e n

public class Numbers {
    public static void main(String[] args) {
      int n = 500; // limite dos numeros
      int soma = 0;
      System.out.print("Numeros de 1 a " + n + ": "); // + é o operador de concatenação de strings
      for (int i=1; i<n; i++){
          soma += i;
          System.out.print(i + ",");
        }
        System.out.println(n);
        soma += n;
        System.out.println("Soma = " + soma);
      }
}
