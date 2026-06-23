import java.util.*;
 class firstQs{
    public static void findOccur (int arr[], int i, int key, ArrayList<Integer> ans){
        
        if(i==arr.length){
            return;
        }

        if(arr[i]==key){
            ans.add(i);
        }
        findOccur(arr, i+1, key, ans);
    }
    public static void main(String args[]){

        int arr[]= {3,2,4,5,6,2,7,2,2};
        ArrayList<Integer> ans = new ArrayList<>();

        findOccur(arr, 0, 2, ans);
        System.out.print(ans);
        
    }
}