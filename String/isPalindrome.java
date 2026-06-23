public class isPalindrome {
    public static boolean isPalindrome_check(String str){
        int n = str.length();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                System.out.println(str);
                return false;
            }  
        }
        System.out.println(str);
        return true;
        
    }
    public static void main(String args[]){
        String str="racecar";
        System.out.println(isPalindrome_check(str));
    }
    
}
