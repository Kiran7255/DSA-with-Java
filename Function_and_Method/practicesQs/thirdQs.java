// Write a java program to check if a number is a palindrome in java? (121 is a palindrome, 321 is not); A number is called a palindrome if the numer is equal to the reverse of a number eg. 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

public class thirdQs {
    public static void isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n>0){
            int rem=n%10;
            rev = rev*10 +rem;
            n=n/10;
        }
        if(rev==original){
            System.out.print("Palindrome no:"+original);
        }else{
            System.out.print("Not Palindrome no:"+original);
        }
    }
    public static void main(String args[]){
        isPalindrome(6521);

    }

    
}
