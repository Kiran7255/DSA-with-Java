//  Write a java program to get a number form the user and print whether it is positive or negative.

import java.util.Scanner;

public class firstQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no:");
        int n = sc.nextInt();

        if(n>0){
            System.out.print("Positive no");
        }else if(n<0){
            System.out.print("Negative no");
        }else{
            System.out.print("Zero");
        }
        
    }
    
}
