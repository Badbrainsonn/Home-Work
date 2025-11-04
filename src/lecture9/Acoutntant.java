package lecture9;

public class Acoutntant implements Position.JobTitle {
    private String name;
    public Acoutntant(){
        name = "Бухгалтер";
    }
    @Override
    public void printPosition(){
        System.out.println("Я работаю\t"+ name);
    }

}

