class Rectangle{

   int largura, altura;
   int x_1, y_1, x_2, y_2;

   Rectangle(int x1, int y1, int x2, int y2){
      Point p1 = new Point(x1, y1);
      Point p2 = new Point (x2, y2);
      largura = p2.x - p1.x;
      altura = p2.y -p1.y;
      x_1 = p1.x;
      y_1 = p1.y;
      x_2 = p2.x;
      y_2 = p2.y;
   }

   Rectangle(Point p1, Point p2){
      largura = p2.x - p1.x;
      altura = p2.y - p1.y;
      x_1 = p1.x;
      y_1 = p1.y;
      x_2 = p2.x;
      y_2 = p2.y;
   }

   int area(){
      return (largura * altura);
   }

   int perimeter(){
      return (altura*2 + largura*2);
   }

   boolean pointInside(Point p){
      if((x_1 <= p.x) && (p.x <= x_2) && (y_1 <= p.y) && (p.y <= y_2))
         return true;
      return false;
   }

   boolean rectangleInside(Rectangle r){
      if((x_1 <= r.x_1) && (r.x_2 <= x_2) && (y_1 <= r.y_1) && (r.y_2 <= y_2))
         return true;
      return false;
   }
}
