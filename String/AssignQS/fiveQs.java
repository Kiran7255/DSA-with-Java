
public class fiveQs {
    public static void main(String args[]){
        String s1= "race";
        String s2="care";

        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int count :freq){
            if(count!=0){
                System.out.println("Not Anagram");
                return;
            }
            }
            System.out.println("Anagram");
            return;
        }
    }
    
