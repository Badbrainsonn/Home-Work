package lecture9;

public class Position {
    public void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Acoutntant accountant = new Acoutntant();


        director.printPosition();
        worker.printPosition();
        accountant.printPosition();

         lecture9.Position.JobTitle obj;

    }


      interface JobTitle {
        void printPosition();


    }
}
