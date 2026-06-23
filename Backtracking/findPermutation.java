public class findPermutation {
    public static void findpermuation(String str, String ans){
        //base case 
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findpermuation(NewStr, ans+curr);
        }
    }
    public static void main(String args[]){
            String str= "abc";
            findpermuation(str, "");
        }
    
}
