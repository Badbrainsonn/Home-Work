public class Main {
    public static void main (String[] args) {
        // Задание 1
        System.out.println("Samarev Aleksandr");

        // Задание 2

        byte age = 33;
        System.out.println("Samarev Aleksandr \t" + age);
        secondBlock();
    }

        public static void secondBlock( ) {
            // Блок 2 Задание 1
            // Написать приложение, которое будет вычеслчть и выводить значение по формуле
            // a=4*(b+c-1)/2; b и с задаем в коде самостоятельно.
            int b = 55;
            int c = 89;
            double a = 4 * (b + c - 1) / 2;
            System.out.println(a);



        // Блок 2 Задание 2
        //  В переменной n хранится двузначное число. Создайте программу,
        // вычисляющую и выводящую на экран сумму цифр n.
        //Например: n=26,  в результате мы должны получить 8 (2+6)
        int n = 99;
        int x = (n / 10);
        int w = (n % 10);
        int n2 = x + w;
        System.out.println(n2);

        //Задача 3
        // В переменной n хранится трехзначное число. Создайте программу, вычисляющую и
        // выводящую на экран сумму цифр n. Например: n=126 в результате мы должны получить
        // 9(1+2+6)
        int numberOne = 355;
        int numberTwo = numberOne / 100;
        int numberThree = (numberOne / 10) % 10;
        int numberFor = numberOne % 10;
        int numberFive = numberTwo + numberThree + numberFor;
        System.out.println("n=" + numberFive + "(" + numberTwo + "+"
                + numberThree + "+" + numberFor + ")");


        //Задача 4
        //В переменной n хранится вещественное число с нулевой дробной частью. Создайте программу
        //округляющую число n до ближайшего целого и выводящую результат на экран.
        double num = 5.0;
        long result =  Math.round (num);
        System.out.println(result);

        // Задача 5
            // В переменных q и w хранятся два натуральных числа.
            //Создайте программу, выводящую на экран результат деления q и w c остатком.
            // Пример вывода программы (для случая, когда в q хранится 21 а w хранится 8) 21/8=2 и 5 в остатке.
            int one = 67;
            int two = 66;

            int division = one / two;     // целая часть
            int remainder = one % two;  // остаток

            System.out.println(one + "/" + two + "=" + division + " и " + remainder + " в остатке.");





    }


     }
