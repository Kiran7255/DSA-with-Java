// check the number is visibel fo  5 or not.


import java.util.*;
public class sixQs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num%5==0){
            System.out.print("5 is divisible ");
        }else{
            System.out.print("5 is not divisible");
        }
        
    }
    
}
