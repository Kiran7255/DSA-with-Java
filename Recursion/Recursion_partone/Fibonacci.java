public class Fibonacci {
    public static int fibonoseries(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1=fibonoseries(n-1);
        int f2=fibonoseries(n-2);
        int fN = f1+f2;
        return fN;

    }
    public static void main(String args[]){
        int n=10;
        System.out.println(fibonoseries(n));
    }
    
}
