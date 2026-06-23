public class noNispower {
    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        int n=16;
        if(isPowerOfTwo(n)){
            System.out.println(n+" is Power of 2");
        }else{
            System.out.println(n+" is Not power of 2");
        }
        
    }
    
}
