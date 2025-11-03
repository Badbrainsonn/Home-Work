package lecture7;
/*Задача 1:
Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
терапевта создать метод, который будет назначать врача пациенту согласно плану
лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
лечить

 */

public class HomeWork7 {
    public static void main (String[] args){
        Doctor bob = new Doctor("Bob", "Surgeon");
        Doctor monika = new Doctor("Monika", "Dentist");
        Doctor frank = new Doctor("Frank", "Therapist");
        Patient patient1 = new Patient("Иван",1);
        Patient patient2 = new Patient("Дима",2);
        Patient patient3 = new Patient("Петр",3);
        frank.assignDoctor(patient1, bob, monika);
        frank.assignDoctor(patient2, bob, monika);
        frank.assignDoctor(patient3, bob, monika);
    }

}
