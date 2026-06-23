public class linearstring {
    public static int linear_Search(String stringValue[], String key){
        for(int i=0; i<=stringValue.length; i++){
            if(stringValue[i] == key){
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String args[]){
        String stringValue[]= {"samosa","dosa","chole bhature"};
        String key = "dosa";

        int value = linear_Search(stringValue, key);
        if(value == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at value:"+value);
        }
        
    }
    
}
