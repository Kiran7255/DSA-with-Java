public class Abstract {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();

        //Animal -> Horse -> Chicken
        
    }
}
    abstract class Animal{
        String color;
        Animal(){
            System.out.println("animal constructor called");
            color ="brown";

        }

        void eat(){
            System.out.println("animal eats");
        }
        abstract void walk();
    }

    class Horse extends Animal{
        Horse(){
            System.out.println("Horse constructor called");
        }
        void changeColor(){
            color = "dark brown";
        }
        void walk(){
            System.out.println("Walks on 4 legs");
        }
    }
    class Chicken extends Horse{
        Chicken(){
            System.out.println("Chicken constructor called");
        }
         void changeColor(){
            color ="yellow";
        }
        void walk(){
            System.out.println("Walk on 2 legs");
        }
    }
    
