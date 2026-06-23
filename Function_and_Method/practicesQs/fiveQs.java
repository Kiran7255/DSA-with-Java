// Write a java method to compute the sum of the digits in an integer (Hint: Approach this question in the following way: a) take a variable sum =0, b) find the last digit of the number c) Add it to the sum d) Repeat a&b until the number becomes 0 )


public class fiveQs {
    public static int Sumdigit(int n ){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.print("Sum:"+sum);
        
    }
    public static void main(String args[]){
        Sumdigit(12345);  
    }
    
}
