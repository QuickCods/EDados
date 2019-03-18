// Uma classe simples para representar um ponto 2D
class Point {
   int x, y;

   Point() {
      x = y = 0;
   }

   Point(int x0, int y0) {
      x = x0;
      y = y0;
   }

   // Devolve uma representação em texto do conteúdo de um Ponto
   public String toString() {
      return "(" + x + "," + y + ")";
   }
}

class Rectangle{

  Point p1 = new Point();
  Point p2 = new Point ();

   Rectangle(int x1, int y1, int x2, int y2){
      p1.x = x1;
      p1.y = y1;
      p2.x = x2;
      p2.y = y2;
   }

   Rectangle(Point p1, Point p2){
      this.p1.x = p1.x;
      this.p1.y = p1.y;
      this.p2.x = p2.x;
      this.p2.y = p2.y;
   }

   int area(){
      return (this.p2.x - this.p1.x) * (this.p2.y - this.p1.y);
   }

   int perimeter(){
      return (this.p2.x - this.p1.x) * 2 + (this.p2.y - this.p1.y) * 2;
   }

   boolean pointInside(Point p){
      return ((this.p1.x <= p.x) && (p.x <= this.p2.x) && (this.p1.y <= p.y) && (p.y <= this.p2.y));
   }

   boolean rectangleInside(Rectangle r){
      return ((this.p1.x <= r.p1.x) && (r.p2.x <= this.p2.x) && (this.p1.y <= r.p1.y) && (r.p2.y <= this.p2.y));
   }
}

class TestRectangle {
   public static void main(String[] args) {
      Point a = new Point(1,1);
      Point b = new Point(2,2);
      Point c = new Point(3,4);
      Point d = new Point(8,2);

      Rectangle amarelo  = new Rectangle(a, c);
      Rectangle laranja  = new Rectangle(2, 3, 9, 6);
      Rectangle verde    = new Rectangle(3, 4, 4, 5);
      Rectangle azul     = new Rectangle(5, 1, 6, 5);
      Rectangle vermelho = new Rectangle(7, 3, 9, 5);

      System.out.println("Perimetro do retangulo amarelo = " + amarelo.perimeter()); // 10
      System.out.println("Perimetro do retangulo laranja = " + laranja.perimeter()); // 20

      System.out.println("Area do retangulo amarelo = " + amarelo.area()); // 6
      System.out.println("Area do retangulo laranja = " + laranja.area()); // 21

      System.out.println("Ponto B dentro rectangulo amarelo? " + amarelo.pointInside(b)); // true
      System.out.println("Ponto D dentro rectangulo amarelo? " + amarelo.pointInside(d)); // false

      System.out.println("Retangulo verde dentro do laranja? " + laranja.rectangleInside(verde));       // true
      System.out.println("Retangulo azul dentro do laranja? " + laranja.rectangleInside(azul));         // false
      System.out.println("Retangulo vermelho dentro do laranja? " + laranja.rectangleInside(vermelho)); // true
   }
}
