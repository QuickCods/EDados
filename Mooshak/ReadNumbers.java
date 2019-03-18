import java.util.Scanner;

public class ReadNumbers {

   static void writeArray(int v[]) {
      for (int i=0; i<v.length; i++)
         System.out.println("v[" + i + "] = " + v[i]);
   }

   static void mediaArray(int v[]){
      double soma = 0;
      for(int i = 0; i < v.length; i++){
         soma += v[i];
      }

      double media = soma / v.length;

      System.out.printf("%.2f\n", media);
   }

   static void amplitudeArray(int v[]){
      int max = v[0];
      int min = v[0];

      for(int i = 0; i < v.length; i++){
         if(v[i] > max)
            max = v[i];
         if(v[i] < min)
            min = v[i];
      }

      int amp = max - min;
      System.out.println(amp);
   }

   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      int n = stdin.nextInt();
      int v[] = new int[n];

      for (int i=0; i<n; i++)
         v[i] = stdin.nextInt();

      mediaArray(v);
      amplitudeArray(v);
   }
}
