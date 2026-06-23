public class Keypadmobile {
    static String keypad[]={
        "","",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public static void combinations(String str, int idx, String ans){
        //base case 
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }

        char curr = str.charAt(idx);

        String letters = keypad[curr-'0'];

        for(int i=0; i<letters.length(); i++){
            combinations(str, idx+1, ans+letters.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "23";
        combinations(str, 0, "");

    }
    
}
