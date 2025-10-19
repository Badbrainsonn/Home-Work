package lecture5;

import java.util.Scanner;

public class HomeWork5 {


    public static void main(String[] args) {
        // firstTask();
        secondTask();

    }

    public static void firstTask() {
        /*Задача 1:
         1.1 Создать двумерный массив, заполнить его случайными числами.
         1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
          1.3 Найти сумму всех получившихся элементов и вывести в консоль.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива 1\t");
        int n = sc.nextInt();
        System.out.print("Введите размер массива 2\t");
        int w = sc.nextInt();

        int[][] nums = new int[n][w];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                // System.out.println("Ваш массив\t" );
                System.out.print("\t" + nums[i][j]);
            }
            System.out.println();

        }

        System.out.println("Введите ваше значение");
        int v = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] += v;
                sum += nums[i][j];
                System.out.print("\t " + nums[i][j]);
            }
            System.out.println();
        }

    }

    public static void secondTask() {
       /*Задача 2:
          Создать программу для раскраски шахматной доски с помощью цикла. Создать
           двумерный массив String 8х8. С помощью циклов задать элементам массива значения
            B(Black) или W(White). При выводе результат работы программы должен быть
        */
        String[][] horse = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    horse[i][j] = "W";
                } else {
                    horse[i][j] = "B";
                }
                System.out.print("\t" + horse[i][j]);

            }
            System.out.println();

        }
    }
}
