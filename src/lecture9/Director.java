package lecture9;

public class Director implements Position.JobTitle {
    private String name;

    public Director() {
        name = "Директор";
    }

        @Override
         public void printPosition() {
            System.out.println("Я работаю\t" + name);
        }
    }
