package lecture12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWork12 {
    public static void main(String[] args) {
        solutionFirst();
    }

    public static void solutionFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");
        for (String w : words) {
            if (w.length() >= 2 && w.length() <= 6) {
                boolean isAbbrev = true;
                for (int i = 0; i < w.length(); i++) {
                    char c = w.charAt(i);


                    if ((c < 'A' || c > 'Z') && (c < 'А' || c > 'Я'))  {
                        isAbbrev = false;
                        break;
                    }
                }

                if (isAbbrev) {
                    System.out.println(w);
                }
                }

            }

        }

}
