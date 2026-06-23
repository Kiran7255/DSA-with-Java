public class isprime {
    public static boolean isPrime(int n){
        for( int i=2; i<=n-1; i++){
            if(n%2==0){
                return false;
            }
        }
        return true;   
    }

    public static void main(String args[]){
        System.out.print(isPrime(2));
    }
    
}
