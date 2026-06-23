import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter operator :");
        char operator = sc.next().charAt(0);

        
        switch(operator){
            case '+':
                System.out.print("Sum:"+(a+b));
                break;
            case '-':
                System.out.print("sub:"+(a-b));
                break;
            case '*':
                System.out.print("Multiple:"+(a*b));
                break;
            case '/':
                System.out.print("Division:"+(a/b));
                break;
            case '%':
                System.out.print("module:"+(a%b));
                break;
            default:{
                System.out.print("All opeator");
            }
        }
    }
    
}
