// using interface 
public class multipleinheritance {
    public static void main(String args[]){
        Bear b = new Bear();
        b.eat();
        b.eats();
        b.walk();
    }
}
    interface Harbivore  {
        void eat();
            
    }
    interface Carnivore  {
        void eats();
        }
    class Bear implements Harbivore,Carnivore{
        public void eat(){
            System.out.println("grass");
        }
        public void eats(){
            System.out.println("chicken");
        }
        void walk(){
            System.out.println("walk");
        }

    }
