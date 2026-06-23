public class RemoveDuplication {
    public static void RemoveDupli(String str, int idx, StringBuilder newstr, boolean map[]){
        //base case 
        if(idx==str.length()){
            System.out.print(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar -'a']==true){
            //duplicate
            RemoveDupli(str, idx+1, newstr, map);
        }else{
            map[currChar -'a']= true;
                RemoveDupli(str, idx+1, newstr.append(currChar), map);
        }
            
        }
    public static void main(String args[]){
        String str = "apnnacollege";
        RemoveDupli(str, 0,
             new StringBuilder("") , 
             new boolean[26]);
    }
    
}
