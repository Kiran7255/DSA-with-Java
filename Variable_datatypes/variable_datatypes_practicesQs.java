import java.util.Scanner;

public class variable_datatypes_practicesQs {

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (a+b+c)/3;

        int s = sc.nextInt();
        int square = (s*s);


        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalBill = (pencil+pen+eraser);

        float amount = totalBill;
        float gst = amount* 0.18f;
        float finalAmount = amount + gst;
    
        System.out.println("The Average of these 3 numbers:"+d);
        System.out.println("Area of Square:"+square);

        System.out.println("Total bill :"+ totalBill);
        System.out.println("Final Amount :"+finalAmount);


    }
}