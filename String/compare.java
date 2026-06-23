public class compare {
    public static void main(String args[]){
        String str1="kiran";
        String str2="kiran";
        String str3 = new String("kiran");

        if(str1==str2){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(str1==str3){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        


        if(str1.equals(str3)){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
    
}
