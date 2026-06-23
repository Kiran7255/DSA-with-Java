// Write a java program to input week number (1-7) and print day of week name using switch case.

import java.util.Scanner;

public class thirdQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter week number (1-7):");
        int week = sc.nextInt();

        switch(week){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("invalid input! please enter week number between 1-7.");
                

        }     
    }
    
}

