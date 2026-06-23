public class findsubstring {
    public static String substring(String str, int si, int ei){
        String substr = " ";
        for(int i=si; i<ei; i++){
            substr = substr+str.charAt(i);
        }return substr;
    }
    public static void main(String args[]){
        String str="Helloworld";
        //System.out.print(substring(str, 0, 4));
        System.out.print(str.substring(0,4));
    }
    
}
