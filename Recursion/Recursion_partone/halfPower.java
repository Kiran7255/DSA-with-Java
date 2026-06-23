public class halfPower {
    public static int optimizedpower(int a, int n){
        if(n==0){
            return 1;
        }
        // int halfPowerSq = optimizedpower(a,n/2)* optimizedpower (a,n/2);
        int halfpower = optimizedpower(a,n/2);
        int halfPowerSq = halfpower * halfpower;

        if(n%2!=0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[]){
        int a= 2;
        int n=5;
        System.out.println(optimizedpower(a, n));
    }
    
}
