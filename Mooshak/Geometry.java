//para submissão
import java.util.Scanner;

public class Geometry{
	public static void main(String[] args){
		Point pontos[];
		Rectangle rectanglos[];
		int vazio = 0;
		int fora = 0;

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		pontos=new Point[n];
		for (int i = 0;i < n ;i++) {
			pontos[i] = new Point(in.nextInt(),in.nextInt());
		}
		int m = in.nextInt();
		rectanglos= new Rectangle[m];
		for (int i = 0;i < m;i++) {
			rectanglos[i] = new Rectangle(new Point(in.nextInt(),in.nextInt()), new Point(in.nextInt(),in.nextInt()));
		}
		for(int i = 0; i < n; i++){
			int count = 0;
			for(int j = 0; j < m; j++)
				if(!rectanglos[j].pointInside(pontos[i]))
					count++;

			if(count == m)
				fora++;
		}
		for(int j = 0; j < m; j++){
			int count = 0;
			for(int i = 0; i < n; i++)
				if(!rectanglos[j].pointInside(pontos[i]))
					count++;

			if(count == n)
				vazio++;
		}

		System.out.println(fora + " " + vazio);
	}
}
