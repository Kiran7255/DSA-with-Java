public class secondQs{
static  String words[] = {"zero", "one", "two", "three","four","five","six","seven","eight","nine"};
    public static void printDigits(int n){
        //base case
        if(n==0){
            return; 
        }
        //recurdive call 
        printDigits(n/10);
        int lastDigit = n%10;
        System.out.print(words[lastDigit]+" ");
    }
    public static void main(String args[]){
        int ans = 2019;
        printDigits(ans);
    }
}