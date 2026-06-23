public class Printkeybadcombination {
    public static String[] keybad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkeybad(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keybad[currChar - '0'];
        for(int i=0; i<mapping.length(); i++){
            printkeybad(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "23";
        printkeybad(str, 0, "");
    }
}