import java.util.Scanner;

public class printtwono {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is largest");
        }else{
            System.out.println("b is largest");
        }
    }
    
}
