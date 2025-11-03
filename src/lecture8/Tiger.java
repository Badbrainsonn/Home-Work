package lecture8;

   public class Tiger extends Animal {
      public Tiger(String name) {
          super(name);
      }
      @Override
      public void voice (){
          System.out.println(getName()+ "Говорит р-р-р-р-р");
      }
       @Override
      public void eat(String food){
          if("Meat".equals(food)){
              System.out.println(getName()+"Любит мясо");
          }else{
              System.out.println(getName()+  "не ест" + food);
          }
      }
}
