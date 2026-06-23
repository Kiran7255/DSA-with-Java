
// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class secondQS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many no:");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<n; i++){
            System.out.print("Enter number:");
            int num = sc.nextInt();

        if(num%2==0){
            evenSum = evenSum+num;
        }else{
            oddSum = oddSum+num;
        }
        System.out.println("EvenSum:"+evenSum);
        System.out.println("OddSum:"+oddSum);
        }
    }
    
}
