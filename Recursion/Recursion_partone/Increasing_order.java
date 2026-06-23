public class Increasing_order {
    public static void increasOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increasOrder(n-1);
        System.out.print(n+" ");
      
    }
    public static void main(String args[]){
        int n=10;
        increasOrder(n);
    }
    
}
