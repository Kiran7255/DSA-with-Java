//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input wuld have eactly one soultion, and you ay not use the same element twice. You can return the answer in any order.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class threeQs {
    public static int[] twosum(int nums[],int target){
       Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};

    }
    public static void main(String args[]){
        int nums[]={2,7,11,15};
        System.out.println(Arrays.toString(twosum(nums,9)));
    }
    
}
