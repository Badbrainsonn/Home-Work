package lecture9;

abstract class Figure {

    String name;


    void print() {
        System.out.println("Геометрическая фигура:\t"+ name);
    }
  abstract double area();
    abstract double perimeter();
}


