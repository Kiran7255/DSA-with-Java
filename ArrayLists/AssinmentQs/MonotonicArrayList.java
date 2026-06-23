import java.util.*;
public class MonotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer>arr){
        boolean inc = true;
        boolean dec = true;

        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(i)>arr.get(i+1))
                inc = false;
            if(arr.get(i)<arr.get(i+1))
                dec=false;
        }
        return inc||dec;
    }
    public static void main(String args[]){
        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);

        System.out.println(isMonotonic(num));

    }
    
}
