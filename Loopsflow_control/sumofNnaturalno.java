import java.util.Scanner;

public class sumofNnaturalno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no:");
        int n = sc.nextInt();

        int s = 0;

        int i=1;
        while(i<=n){
            s = s + i;
            System.out.println(i);
            i++;
        }
        System.out.print("sum:"+s);

    }
    
}
