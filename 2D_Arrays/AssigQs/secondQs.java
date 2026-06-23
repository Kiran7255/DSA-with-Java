// Print out the sum of the numbers in the second row of the "nums" array. Example: input int [][] nums = {{1,4,9},{11,4,3},{2,2,3}}.

public class secondQs {
    public static void sumofno(int nums[][]){
        int sum = 0;
        int i=1;
            for(int j=0; j<nums[0].length; j++){
                sum=sum+nums[i][j];
        }
        System.out.print(sum);
            
    }
    public static void main(String args[]){
        int nums[][]={{1,4,9},
                    {11,4,3},
                    {2,2,3},
                };
            sumofno(nums);
    }
    
}
