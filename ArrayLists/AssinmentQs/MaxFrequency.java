
import java.util.*;

public class MaxFrequency {


    public static int mostfrequency(ArrayList<Integer> arr, int key){

        int freqArr[] = new int[1001];

        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(i) ==key){
                freqArr[arr.get(i+1)]++;
            }
        }                  

        int maxValue = 0;
        int target = 0;

        for(int i=0; i<freqArr.length; i++){
            if(freqArr[i]>maxValue){
                target=i;
                maxValue = freqArr[i];
            }
        }
        return target;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        int ans = mostfrequency(arr,k);

        System.out.println(ans);

    }

    
}
