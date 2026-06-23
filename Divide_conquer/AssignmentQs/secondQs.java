

public class secondQs {
    public static int majorityElement(int[] nums){
        int count = 0; 
        int candidate = -1;
        for(int x:nums){
            if(count==0){
                candidate = x;
            }
            if(candidate==x){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String args[]){
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    
}

   