package lecture3;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        fieldOfMiracle();

    }

    public static void fieldOfMiracle() {


        System.out.println("Привет, рад видеть тебя в моей игре!");
        System.out.println("Все очень просто, я загадал слово, а ты должен его отгадать ");
        Scanner input = new Scanner(System.in);

        String start = "Да";
        String finish = "Нет";
        System.out.println("Если ты готов начать, введи \"Да\". Если пока не готов введи \" нет\"???");

        String next = input.nextLine();
        if (next.equalsIgnoreCase(start)) {
            System.out.println("Отлично. Тогда начнем!.");
            System.out.println("Вот тебе первая подсказка!");
            System.out.println("Зимой и летом одним цетом!");
        }
             if (next.equalsIgnoreCase(finish)){
                 System.out.println("Может быть в другой раз!");
        }else {
                 System.out.println("Может быть в другой раз!");
             }


        }
    }








