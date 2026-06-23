import java.util.Scanner;

public class firststring{
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }



    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // there are two type of delected in string 
    // String name = "kiran";
    // String str2 = new String("kumari");

    // String name;
    // //name = sc.next();
    // name = sc.nextLine();
    // System.out.print(name);

    // using length() function and concatenation of two string 
    String firstname = "kiran";
    String lastname = "kumari";
    String FullName = firstname + " "+ lastname;
    System.out.println(FullName); //output: kiran kumari 
    System.out.println(FullName.length()); //output: 12

    printLetters(FullName);

    }



}