import java.util.*;

public class BeautifulArrayList {
    public static ArrayList<Integer> generateBeautifulArray(int n){

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while (ans.size()<n) {
            ArrayList<Integer>temp = new ArrayList<>();
            int ansSize = ans.size();

            for(int i=0; i<ansSize; i++){
                if((ans.get(i)*2)-1 <=n){
                    temp.add((ans.get(i)*2)-1);
                }
            }
            for(int i=0; i<ansSize; i++){
                if((ans.get(i)*2)<=n){
                    temp.add(ans.get(i)*2);
                }
            }
        ans= temp;
        }
        return ans;
    }

    public static void main(String args[]){
        int n=6;

        ArrayList<Integer> result = generateBeautifulArray(n);

            System.out.println(result);
    }
    
}
