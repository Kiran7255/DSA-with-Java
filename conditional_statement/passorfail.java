import java.util.Scanner;

public class passorfail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks:");
        int marks = sc.nextInt();

        // System.out.print(marks>=33? "Pass": "Fail");
        String result = marks>=33? "pass":"fail";
        System.out.println("Result:"+result);
        System.out.println("Marks:"+marks);      
    }
    
}
