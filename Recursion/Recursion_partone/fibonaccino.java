public class fibonaccino {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int result = fibonacci(n-1)+fibonacci(n-2);
        return result;
    }
    public static void main(String args[]){
        int n=10;
        System.out.print(fibonacci(n));
    }
    
}
