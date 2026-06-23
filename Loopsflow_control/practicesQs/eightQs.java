import java.util.Scanner;

public class eightQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no:");
        int n = sc.nextInt();

        int i=1;
        int s=0;
        while(i<=n){
            System.out.print(i);
            s=s+i;
            i++;
        }
        System.out.print("\t"+"sum:"+s);

        System.out.print("\n");

        int j=n;
        while(j>=1){
            System.out.print(j);
            j--;
        }
    }
    
}
