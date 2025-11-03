package lecture8;

public class Animal {
     private String name;
     public Animal(String name){
         this.name = name;
     }

     public void voice(){
      System.out.println( name + "издает звук");
    }
    public void eat (String food){
     System.out.println ( name + "ест" + food);
    }


    public String getName(){
         return name;
    }
}

