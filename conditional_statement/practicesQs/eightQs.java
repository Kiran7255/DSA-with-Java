// Character input vowel (a,e,i,o,u), consonant.

import java.util.Scanner;

public class eightQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character:");
        String ch = sc.next();
        char c = ch.toLowerCase().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.print("Vowel"+c);
        }else{
            System.out.print("Consonant"+c);
        }

        }


    }
