public class subarraysmaxandmin {
    public static void subarrays_maxandmin(int numbers[]){
        int ts=0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum=0;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                System.out.print("="+sum);
                if(sum<minSum){
                    minSum = sum;
                }if(sum>maxSum){
                    maxSum = sum;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray:"+ts);
        System.out.println("Minnimum sum:"+maxSum);
        System.out.println("Maximum sum:"+minSum);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12};
        subarrays_maxandmin(numbers);
    }
    
}
