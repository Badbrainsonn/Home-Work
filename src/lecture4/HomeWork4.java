 import java.util.Scanner;



public class HomeWork4 {
    public static void main(String[] args) {
        //fierstTask();
        //secondTask();
        //thirdTask();
       // fourthTaskk();
         //fifthTask();
          sixthTask();
    }

    //Задача 1:
    //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
    public static void fierstTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("Привет, введли целое число:\t");
        int size = input.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.println("[" +i+"]" + num[i]);


        }
        System.out.println("***");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println("[" +i+"]" + num[i]);
        }
    }


    public static void secondTask() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число.");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число");
            numbers[i] = sc.nextInt();

        }
        int min = numbers[0];
        int max = numbers[0];
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("Минимальное значение" + min);
        System.out.println("Максимальное значение " + max);
    }

    public static void thirdTask() {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 1; i < size; i++) {
            System.out.println("Введите число:");
            numbers[i] = sc.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;

            }
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }
        System.out.print("Минимальное значение" + min + "(Индекс" + minIndex + ")");
        System.out.print("Максимальное  значение" + max + "(Индекс" + maxIndex + ")");

    }

    public static void fourthTaskk() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число" + (i + 1) + ":");
            a[i] = sc.nextInt();
        }
        int zeroCound = 0;
        for (int x : a) {
            if (x == 0) {
                zeroCound++;

            }
        }
        if (zeroCound > 0) {
            System.out.println("Количество нулевых элементов \t" + zeroCound);
        } else {
            System.out.println("Нулевых элементов нет.\t");

        }


    }
    public static void fifthTask() {
        //Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д
        Scanner input = new Scanner(System.in);
        System.out.print("Привет, введли целое число:\t");
        int size = input.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.println("[" + i + "]" + num[i]);

        }
        System.out.println(" * * * ");
        for (int i = 0; i < num.length ; i++) {
            int j = num.length - 1 - i;
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            System.out.println("[" + i + "]" + num[i]);
        }

    }
    public static void sixthTask(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введи размер массива:\t");
        int size = input.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            System.out.println("[" + i + "]" + num[i]);
            if (num[0]<=num.length -1);
        }

        System.out.println("Массив не является строго возрастающим ");
    }
}











