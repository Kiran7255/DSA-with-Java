// Write a java progrm that takes a year form the user and print whether that year is a leap year or not .

import java.util.Scanner;

public class fiveQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter year:");
        int year = sc.nextInt();
        
        boolean x = (year % 4==0);
        boolean y = (year % 100!=0);
        boolean z = (year % 100 ==0)&& (year % 400 ==0);


        if(x && (y ||z))
        {
            System.out.print(year +"leap year");
        }else{
            System.out.print(year +"not leap year");
        }
    }
    
}
