import java.util.Scanner;

public class tenQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int n;
        int sum = 0;
        do{
        System.out.print("Enter any no:");
        n = sc.nextInt();
        sum=sum+n;
        }while(n!=0);
        System.out.println("Total sum:"+sum);
    }
    
}
