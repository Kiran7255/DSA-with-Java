
import java.util.ArrayList;
public class sizeofAL {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main (String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Reverse print 

        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        // find maximum in an Arraylist

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
            //max = Math.max(max,list.get(i));
        }
        System.out.println("Max element="+max);


        // swap element 
        int idx1 = 1; int idx2 = 4;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);


        


    }

    
}
