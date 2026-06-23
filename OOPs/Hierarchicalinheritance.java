class Hierarchicalinheritance{
    public static void main(String args[]){
        Dog papi = new Dog();
        papi.breathe();

    }
}
    class Animals{
        String color;
        void eat(){
            System.out.println("eats");
        }void breathe(){
            System.out.println("Breathe");
        }
    }
    class Mammals extends Animals{
        int legs;
    }
    class Dog extends Animals{
        String breed;
    }
