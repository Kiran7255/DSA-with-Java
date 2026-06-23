// Marks  kebasicpar

import java.util.Scanner;

public class sevenQs {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int marks = sc.nextInt();

      if(marks >=90){
        System.out.print("Grade A");
      }else if(marks >75){
        System.out.print("Grade B");
      }else if(marks>50){
        System.out.print("Grade C");
      }else{
        System.out.print("fail");
      }

      
   }
}
    

