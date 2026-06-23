class Automobile{
    private String drive(){
        return "Driving vehicle";
    }
}
class Car extends Automobile{
   // @override
    protected String drive(){
        return "Driving car";
    }
}
class Electriccar extends Car{
    public final String drive(){
        return "Driving electric car";
    }
}

public class secondQs {
    public static void main(String [] args){
        final Car car = new Electriccar();
        System.out.println(car.drive());
    }

    
}
