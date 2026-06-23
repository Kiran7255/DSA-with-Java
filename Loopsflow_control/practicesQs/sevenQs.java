import java.util.Scanner;

public class sevenQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int s = 0;
        int fact = 1;



        for(int i=1; i<=n; i++){
            System.out.print(i); //print numbers 1 to n
            s=s+i;
            fact = fact*i;

        }
        System.out.println("\t"+"Sum:"+s);
        System.out.println("Factorial of a number:"+fact);

        for(int i=n; i>=1; i--){
            System.out.print(+i);// Print reverse numbers
        }
        System.out.print("\n");

        
        for(int i=1; i<=m; i++){// print even numbers till n
            if(i%2==0){
                System.out.println(i + " ");
            }
            
        }
    }
    
}
