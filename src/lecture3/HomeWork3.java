package lecture3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
       // firstTask();
       // secondTask();
       // thirdTask();
        fourthTask();
    }

    public static void firstTask() {
        //Напишите программу, которая будет принимать на вход из консоли и на выход
        //будет выводить сообщение четное число или нет.
        //Для определения четности числа используйте операцию получения остатка
        //от деления (операция выглядит так:'%2')
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваше число");
        while (true) {

            int number = input.nextInt();
            boolean country = true;
            if (number % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
              break;
            }

        }


    }



    public static void secondTask() {
        //Для введенного числа t (температура на улице) вывести.
        // Если >-5, то вывести "Warm". Если -5>=t>-20, то вывести "Normal".
        //Если -20>=t, то вывести "Cold".
        Scanner input = new Scanner(System.in);
        System.out.println("Введи целое число");
        while (true) {
            int t = input.nextInt();
            boolean temperature = true;
            if (t == 0 || t > -5) {
                System.out.println("warm");

            } else {
                if (t > -20) {
                    System.out.println("Normal");
                } else {
                    if (-20 >= t) {
                        System.out.println("Cold");
                        break;
                    }
                }


            }
        }

    }



    public  static void  thirdTask() {
        // Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

        int a = 10;
        int b = 20;


        for (int country = a; country <= b; country++) {
            System.out.printf("Значение " + country + " в квадрате равно %.0f \n", Math.pow(country, 2));
        }


    }

    public static void fourthTask() {
        //Необходимо,чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
        int a = 7;
        while( a < 98 ) {
            System.out.print("Значение x: " + a );
            a++;
            System.out.print("\n");

        }


    }
}



