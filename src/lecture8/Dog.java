package lecture8;

    public class Dog extends Animal{

        public Dog(String name) {
            super(name);
        }
        @Override
        public void voice(){
            System.out.println(getName() + "Говорит гав-гав");
        }
        @Override
        public void eat (String food) {
            if ("Meat".equals(food)){
                System.out.println(getName() + "\tЛюбит Мясо" );
            }else{
                System.out.println(getName()+ "не ест\t"+ food);
            }
        }
    }

