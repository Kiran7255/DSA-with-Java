import java.util.ArrayList;
import java.util.Collections;

public class SortingArraylist{
    public static void main (String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(6);
        list.add(7);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // descending 
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        
    }
}
    