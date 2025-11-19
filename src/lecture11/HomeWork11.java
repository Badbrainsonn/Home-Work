package lecture11;
/*
1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
найденные строки и их длину.
2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
значений их длины.
3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
средней, а также их длину.
4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.
5. Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */

import java.sql.Struct;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        // firstSolution();
        // getSolution();
        duplicateLetters();
    }

    public static void firstSolution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три строки\t");
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        String text3 = scanner.nextLine();
        System.out.println("Строка 1 :\t" + text1.length());
        System.out.println("Строка 2:\t" + text2.length());
        System.out.println("Строка 3 :\t" + text3.length());
        // System.out.println("Длинна строки 1"+text1.length());
        // System.out.println("Длинна строки 2"+text2.length());
        // System.out.println("Длинна строки 3"+text3.length());
        String shorts = text1;
        String longs = text1;

        if (text2.length() < shorts.length()) {
            shorts = text2;
        }
        if (text3.length() < shorts.length()) {
            shorts = text3;
        }
        if (text2.length() > longs.length()) {
            longs = text2;
        }
        if (text3.length() > longs.length()) {
            longs = text3;
        }

        System.out.println("Самая короткая: " + shorts + " (" + shorts.length() + ")");
        System.out.println("Самая длинная: " + longs + " (" + longs.length() + ")");

        String[] strings = {text1, text2, text3};
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        for (String values : strings) {
            System.out.println(values);

        }
    }

    public static void getSolution() {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите три строки");
        String[] str = new String[3];

        for (int i = 0; i < str.length; i++) {
            str[i] = scan.nextLine();
        }
        String result = null;


        for (String line : str) {
            // разбиваем по пробелам (только String.split)
            for (String word : line.split("\\s+")) {
                if (word.isEmpty()) continue;
                word = word.toLowerCase(java.util.Locale.ROOT);
                if (allCharsUniqueByStringOnly(word)) {
                    result = word;
                    break;
                }
            }
        }
        if (result != null) {
            System.out.println("Первое слово с разными символами: " + result);
        } else {
            System.out.println("Подходящее слово не найдено");
        }
    }

    private static boolean allCharsUniqueByStringOnly(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) != s.lastIndexOf(ch)) return false;
        }
        return true;
    }

    public static void duplicateLetters() {
        String text = "Hello";
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            result = result + c + c;
        }

        System.out.println(result);


    }
}





