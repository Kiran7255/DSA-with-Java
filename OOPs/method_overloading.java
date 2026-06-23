public class method_overloading {
    public static void main(String args[]){
        calculator cal = new calculator();
        System.out.println(cal.sum(2,4));
        System.out.println(cal.sum((float)1.5,(float)4.3));
        System.out.println(cal.sum(2,4,6));  
    }
}
    class calculator {
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    } 
}
