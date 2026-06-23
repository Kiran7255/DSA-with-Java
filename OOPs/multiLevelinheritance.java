public class multiLevelinheritance {
    public static void main(String args[]){
        Dog papi = new Dog();
        papi.eat();
        papi.breathe();

        papi.legs = 4;
        papi.breed = "Labrador";
        
        System.out.println(papi.legs);
        System.out.println(papi.breed);
    }
}
    class Animal{
        String color;
        void eat(){
            System.out.println("eats");
        }
        void breathe(){
            System.out.println("breathe");
        }
    } 
    class Mammals extends Animal{
        int legs;
    }
    class Dog extends Mammals{
        String breed;
    }
