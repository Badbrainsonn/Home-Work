package lecture8;

   public class Rabbit extends Animal {
       public Rabbit (String name){
           super(name);
       }
       @Override
       public void voice (){
           System.out.println(getName() + "Говорит ф-ф-ф-ф-ф-");
       }
       @Override
       public void eat (String food){
           if("Grass".equals(food)) {
               System.out.println(getName()+ "Любит травку и одуванчики");
           }else{
               System.out.println(getName()+ "не ест "+ food);
           }

       }

}
