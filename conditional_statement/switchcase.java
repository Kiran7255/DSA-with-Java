import java.util.Scanner;

public class switchcase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //  int number = 0;

        switch (number) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("Momoses");
                break;
        
            default:
                System.out.println("we wake up");
        }
    }

    
}
