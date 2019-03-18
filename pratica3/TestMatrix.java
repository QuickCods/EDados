import java.util.Scanner;

class Matrix {
   int data[][]; // os elementos da matriz em si
   int rows;     // numero de linhas
   int cols;     // numero de colunas

   // construtor padrao de matriz
   Matrix(int r, int c) {
      data = new int[r][c];
      rows = r;
      cols = c;
   }

   // Ler os rows x cols elementos da matriz
   public void read(Scanner in) {
      for(int i = 0; i < rows; i++)
         for(int j = 0; j < cols; j++)
            data[i][j] = in.nextInt();
   }

   // Representacao em String da matrix
   public String toString() {
      String ans = "";
      for(int i = 0; i < rows; i++) {
         for(int j = 0; j < cols; j++)
            ans += data[i][j] + " ";
         ans += "\n";
      }
      return ans;
   }

   //devolve uma matriz identidade
   public static Matrix identity(int n){
     Matrix matrix = new Matrix(n,n);

      for(int i = 0; i < n; i++){
         for(int j = 0; j < n; j++){
            if(i == j)
              matrix.data[i][j] = 1;
            else
              matrix.data[i][j] = 0;
         }
      }
      return matrix;
   }

   //devolva uma matriz transposta
   public Matrix transpose(){
     Matrix matrix = new Matrix(this.cols,this.rows);

     for(int i = 0; i < this.cols; i++){
        for(int j = 0; j < this.rows; j++){
          matrix.data[i][j] = this.data[j][i];
        }
      }
      return matrix;
   }

   //devolve uma matriz que é a soma termo a termo da matriz com m
   public Matrix sum(Matrix m){
     Matrix res = new Matrix(this.rows,this.cols);

     for(int i = 0; i < res.rows; i++){
       for(int j = 0; j < res.cols; j++){
           res.data[i][j] = this.data[i][j] + m.data[i][j];
         }
       }
     return res;
   }

   //devolve uma matriz que é a multiplicação da matriz com m
   public Matrix multiply(Matrix m){
     Matrix res = new Matrix(this.rows,m.cols);

     for(int i = 0; i < res.rows; i++){
       for(int j = 0; j < res.cols; j++){
         for(int k = 0; k < m.rows; k++){
           res.data[i][j] += this.data[i][k] * m.data[k][j];
         }
       }
     }
     return res;
   }

}

class TestMatrix {
   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);

      Matrix m1 = Matrix.identity(5);
      System.out.println(m1);

      Matrix m2 = new Matrix(stdin.nextInt(), stdin.nextInt());
      m2.read(stdin);
      System.out.println(m2);
      Matrix m3 = new Matrix(stdin.nextInt(), stdin.nextInt());
      m3.read(stdin);
      System.out.println(m3);
      Matrix m4 = new Matrix(stdin.nextInt(), stdin.nextInt());
      m4.read(stdin);
      System.out.println(m4);

      Matrix m5 = m1.transpose();
      System.out.println(m5);
      Matrix m6 = m2.transpose();
      System.out.println(m6);

      Matrix m7 = m2.sum(m3);
      System.out.println(m7);
      Matrix m8 = m2.multiply(m4);
      System.out.println(m8);
   }
}
