package lecture6;


import java.util.Scanner;

public class HomeWork6 {

    public static void main(String[] args) {
        myCard();
        freeCard();
    }

    public static void myCard() {
        CreditCard my = new CreditCard();
        Scanner sc = new Scanner(System.in);
        my.numerСard = "45670000458748";
        my.deposit(1000);
        System.out.print("Номер счета:\t" + my.numerСard);
        System.out.println();
        System.out.println("Доступные средства\t" + my.balance);
        System.out.println();
        System.out.println("Пополнение счета: Выберете 1");
        System.out.println("Снятие средств: Выберете 2");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Введите сумму\t");
            double sum = sc.nextDouble();
            my.balance += sum;
            System.out.println("Ваш балланс\t" + my.balance);
        } else if (choice == 2) {
            System.out.print("Введите сумму\t");
            double sum = sc.nextDouble();
            my.balance -= sum;
            System.out.println("Ваш баланс\t" + my.balance);


        }
    }

    public static void freeCard() {
     CreditCard card1 = new CreditCard();
     CreditCard card2= new CreditCard();
     CreditCard card3 = new CreditCard();
     card1.numerСard = "1111111111111";
     card1.balance = 100;
     System.out.println("Ваш Баланс"+ card1.balance);
     card2.numerСard = "2222222222222";
     card2.balance = 200;
        System.out.println("Ваш Баланс"+ card2.balance);
     card3.numerСard = "3333333333333";
     card3.balance = 300;
        System.out.println("Ваш Баланс"+ card2.balance);
        card1.deposit(50);
        card2.deposit(100);
        card3.debit(70);

        System.out.println("\nПосле операций:");
        card1.info();
        card2.info();
        card3.info();
    }
}
