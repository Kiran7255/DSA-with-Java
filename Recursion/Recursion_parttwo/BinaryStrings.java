public class BinaryStrings {
    public static void binarystrings(int n, int lastplace, String str){
        if(n==0){
            System.out.print(str);
            return;
        }
        binarystrings(n-1, 0, str+"0");
        if(lastplace==0){
            binarystrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        binarystrings(3, 0, " ");
    }
    
}
