class Hybridinheritance{
    public static void main(String args[]){
        Mammals papi = new Mammals();
        papi.eat();
        papi.Dog();

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
    class Fish extends Animals {
        void tuna(){
            System.out.println("tuna");

        }void shark(){
            System.out.println("shark");
        }
    }
    class Bird extends Animals{
        void peacock(){
            System.out.println("peacock");
        }
    }
    class Mammals extends Animals{
        void Dog(){
            System.out.println("dog");
        }void cat(){
            System.out.println("cat");
        }
     }
