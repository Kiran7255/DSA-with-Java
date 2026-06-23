// Triangle Valid or Not 

import java.util.Scanner;

public class nineQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a , b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.print("Valid Triangle");
        }else{
            System.out.print("Not Valid Triangle");
        }

    }
    
}
