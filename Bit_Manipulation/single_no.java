//  what is the value of x^x for any value of x?

public class single_no {
    public static int SingleNumber(int[] nums){
        int n=nums.length;
        int x=0;
        for(int i=0; i<n; i++){
            x=x^nums[i];

        }
        return x;
    }
    public static void main(String args[]){
        int nums[]= {4,1,4,3,1};
        int ans = SingleNumber(nums);
        System.out.println("Single Number is:"+ans);
    }
    
}
