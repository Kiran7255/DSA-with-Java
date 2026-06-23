// S = "i.like.programming.very.much".  find the reverse - = "much.very.programming.like.i"
import java.util.*;
public class sixQs {
    public static void main(String args[]){
        String s="i.like.programming.very.much";
        ArrayList<String> words = new ArrayList<>();
        String[] parts = s.split("\\.");
        for(String word:parts){
            if(!word.isEmpty()){
                words.add(word);
            }  
        }
        Collections.reverse(words);
        String result = String.join(".", words);
        System.out.println(result);
    }
    
}
