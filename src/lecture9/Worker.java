package lecture9;

public class Worker implements Position.JobTitle {
    private String name;

    public Worker() {

        name = "Работник";

    }
    @Override
    public void printPosition(){
        System.out.println("Я работаю\t"+ name);
    }
}
