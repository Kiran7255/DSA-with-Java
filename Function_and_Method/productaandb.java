import java.util.Scanner;

public class productaandb {
    public static int multiple(int x, int y){
        int product = x * y;
        return product;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiple(a, b);
        System.out.print("Multiple:"+prod);
    }

    
}
