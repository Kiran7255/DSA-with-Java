import java.util.Scanner;

public class checkprimeornot {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no:");
        int n = sc.nextInt();

        if(n==2){
            System.out.println("prime no");
        }else{
            boolean isPrimeno = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isPrimeno = false;
                }
            }
        if(isPrimeno == true){
            System.out.println("Prime no");
        }else{
            System.out.println("Not a Prime no");
        }
        }
        
    }
    
    
}
