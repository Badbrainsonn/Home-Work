package lecture9;
/*Задача 1:
Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные
классы

 */

/*Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве

 */

public class HomeWork9 {
    public void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Rectangle(4, 6),
                new Circle(15),
                new Triangle(3, 5, 6),
                new Rectangle(2, 6 ),
                new Circle( 9)
        };
        double totalPerimeter = 0;
        for (Figure f : figures){
            f.print();
            System.out.println("Площадь:\t"+ f.area());
            System.out.println("Периметр:\t" + f.perimeter());
            System.out.println();
            totalPerimeter += f.perimeter();
        }
        System.out.println("Общая сумма периметров:"+ totalPerimeter);
    }
}







