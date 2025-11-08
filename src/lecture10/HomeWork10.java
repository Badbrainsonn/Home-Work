package lecture10;
/*
Задача 1:
Создать класс для описания пользователя системы. Переопределить в классе методы
toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.
 */

public class HomeWork10 {
    public static void main(String[] args) {


            User user1 = new User("Bob","destroyer@gmail.com","QazWsx123",44);
            User user2 = new User("Bob","destroyer@gmail.com","QazWsx123",45);
            System.out.println(user1);
            System.out.println("user1 == user2?\t"+ (user1==user2));
            System.out.println("user1 == user2?\t"+ user1.equals(user2));
            System.out.println(user1.hashCode());
            System.out.println(user2.hashCode());

        }

    }

