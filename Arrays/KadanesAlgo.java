public class KadanesAlgo {
    public static void kadanes_Algo_Max(int numbers[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
           
        }
         System.out.print("Our max subarray sum is :"+ms);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        //int numbers[]={-2,-5,-2,-7,-6,-2};
        kadanes_Algo_Max(numbers);
    }
    
}
