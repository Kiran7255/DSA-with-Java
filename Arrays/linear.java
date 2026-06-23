//import java.util.*;
public class linear{
    public static int linera_Search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
            return -1;
        }


    public static void main(String args[]){
        int numbers[] = {2,4,6,10,12,14,16};
        int key = 12;

        int index = linera_Search(numbers, key);
        if(index == -1){
            System.out.print("NOT Found");
        }else{
            System.out.println("key is at index:"+index);
        }
    }
}