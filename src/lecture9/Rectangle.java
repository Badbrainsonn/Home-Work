package lecture9;

 public  class Rectangle extends Figure{
     int width;
     int height;
      public Rectangle( int width, int height){

          this.width = width;
          this.height= height;
          this.name = "Прямоугольник";
      }
     @Override
      double area(){
         return width * height;
     }

     @Override
     double perimeter(){
      return 2 * (height+ width);
     }

}
