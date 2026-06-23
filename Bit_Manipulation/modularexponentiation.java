public class modularexponentiation {
    public static int modularexp(int n, int a, int m){
        int ans = 1; 
        while (n>0) {
            //odd
            if(n%2==1){
                ans = (ans*a)%m;
            }
            //square
            a=(a*a)%m;
            //divide by 2
            n=n/2;
            
        }
        return ans;
    }
    public static void main(String args[]){
        int a=3;
        int n=13;
        int m=7;
        System.out.println(modularexp(n, a, m));
    } 
}
