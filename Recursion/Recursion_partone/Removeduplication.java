public class Removeduplication{
    public static boolean[] map = new boolean[26];
    public static void removeDuplication(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.print(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplication(str, idx+1, newString);
        }else{
            newString = newString+currChar;
            map[currChar - 'a']=true;
            removeDuplication(str, idx+1, newString);
        }
        
    }
    public static void main(String args[]){
        String str = "abbccda";
        removeDuplication(str, 0, "");
    }
}