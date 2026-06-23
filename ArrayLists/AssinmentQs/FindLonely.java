import java.util.*;

public class FindLonely {

    public static ArrayList<Integer> findLonely(ArrayList<Integer>arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n=arr.size();

        Collections.sort(arr);

        for(int i=0; i<n; i++){
            if(i!=0 && (arr.get(i-1)==arr.get(i) || arr.get(i-1) == arr.get(i)-1)){
                continue;
            }if(i!=n-1 && (arr.get(i+1)==arr.get(i) || arr.get(i+1) == arr.get(i)+1)){
                continue;
            }
            result.add(arr.get(i));
        }
        return result;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            arr.add(num);
        }

        ArrayList<Integer> ans = findLonely(arr);

        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i)+" ");
        }

    }
    
}
