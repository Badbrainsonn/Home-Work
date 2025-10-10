package lecture3;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        fieldOfMiracle();

    }

    public static void fieldOfMiracle() {

        {


            System.out.println("Привет, рад видеть тебя в моей игре!");
            System.out.println("Все очень просто, я загадал слово, а ты должен его отгадать ");
            Scanner input = new Scanner(System.in);

            String start = "Да";
            String finish = "Нет";
            System.out.println("Если ты готов начать, введи \"Да\". Если пока не готов введи \" нет\"???");
            boolean game = false;
            String next = input.nextLine();
            if (next.equalsIgnoreCase("да ")) {
                System.out.println("Отлично. Тогда начнем.");
            } else {
                  if ((game == false)) {
                 if (next.equalsIgnoreCase(next)) {
                        System.out.println("Может быть в другой раз. Пока");
                    }

                }
            }
        }
    }
}




