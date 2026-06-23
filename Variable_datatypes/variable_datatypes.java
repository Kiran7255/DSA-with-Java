import java.util.*;
public class variable_datatypes {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        String name = sc.nextLine();
        System.out.print(name);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int product =(a*b);
        System.out.println("sum:"+c);
        System.out.print("Product:"+product);
    }
    
}
