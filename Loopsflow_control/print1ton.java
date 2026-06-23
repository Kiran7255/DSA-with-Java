import java.util.Scanner;

public class print1ton {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no:");
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        
        // for(int i=1; i<=n; i++){
        //     System.out.println(i);
        // }
    }
    
}
