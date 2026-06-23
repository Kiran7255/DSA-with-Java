
import java.util.ArrayList;
public class ArrayListsOperations {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Boolean> list2 = new ArrayList<>();
        ArrayList <String> list3 = new ArrayList<>();

        // Add Element ---O(1)
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1,5);
        System.out.print(list);

        // Get Element  ---- O(1)
        // int Element = list.get(1);
        // System.out.print(Element);

        //Remove / Delete ----- O(n)
        // list.remove(1);
        // System.out.println(list);

        // Set
        // list.set(2,10);
        // System.out.println(list);

        //Contains Element 
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(12));

    }   
}