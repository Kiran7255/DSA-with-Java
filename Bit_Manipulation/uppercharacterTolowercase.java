public class uppercharacterTolowercase {
    public static void main(String args[]){
        //char ch = 'A';

        for(char ch='A'; ch<='Z'; ch++){

        char lower = (char)(ch|' ');
        System.out.print(lower+" ");
        }
    }
    
}
