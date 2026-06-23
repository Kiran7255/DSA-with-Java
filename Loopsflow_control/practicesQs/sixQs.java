import java.util.Scanner;

public class sixQs {
    public static void printMultiplicationTable(int number){
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=10; i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }

    }
    public static void main(String args[]){
        printMultiplicationTable(7);
    }
    
}
