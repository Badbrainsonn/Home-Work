package lecture9;

public class Circle extends Figure {
    double radius;

    public Circle(  double radius){

        this.radius = radius;
        this.name = "Круг";
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
    @Override
     double perimeter(){
        return 2 * Math.PI * radius;
    }
}
