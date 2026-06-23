public class TilingProblem{
    public static int tiliproblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 = tiliproblem(n-1);

        //horizontal choice
        int fnm2 = tiliproblem(n-2);

        int toWays = fnm1 + fnm2;
        return toWays;
        // return tiliproblem(n-1)+tiliproblem(n-2);
    }
    public static void main(String args[]){
        System.out.print(tiliproblem(4));
    }
}