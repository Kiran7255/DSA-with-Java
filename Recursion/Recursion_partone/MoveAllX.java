public class MoveAllX {
    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newString = newString+'x';
            }
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString = newString+currChar;
             moveAllX(str, idx+1, count, newString);
        }
        
    }
    public static void main(String args[]){
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
    
}
