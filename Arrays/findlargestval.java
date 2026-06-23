
import java.util.*;
public class findlargestval {
    public static int largest_value(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest= numbers[i];
            }if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is:"+smallest);
         return largest;
    }

    public static void main(String args[]){
        int numbers[]={1,2,4,6,8,3,5};
        System.out.print("largest value is: "+largest_value(numbers));
    }
    
}
