package lecture8;
/*Задача 1:
Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен

 */
public class HomeWork8 {
    public static void main (String[]args){
    Animal rabbit = new Rabbit("Кролик");
    Animal dog = new Dog("Собака");
    Animal tiger = new Tiger("Тигр");

    rabbit.voice();
    rabbit.eat("Grass");
    rabbit.eat("Meat");

     System.out.println();

     dog.voice();
     dog.eat("Meat");
     dog.eat("Grass");

     System.out.println();
     tiger.voice();
     tiger.eat("Meat");
     tiger.eat("Grass");
    }

}
