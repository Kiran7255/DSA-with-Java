// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// 1. nums[1,2,3,1] 2. nums[1,2,3,4] 3. nums[1,1,1,3,3,4,3,2,4,2]  

import java.util.HashSet;

public class firstQs {
    // public static boolean containsDuplicate(int nums[]){

    //     for(int i=0; i<nums.length; i++){
    //             for(int j=i+1; j<nums.length; j++){
    //                 if(nums[i]==nums[j]){
    //                     return true;
    //                 }

    //             }
    //         }
    //         return false;
    //     }

    public static boolean containsDuplicate_hashset(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
        }
    }
    return false;
}
    
    public static void main(String args[]){
        //int nums[]={1,2,3,1};
         //int nums[] = {1,2,3,4};
         int nums[] = {1,1,1,3,3,4,3,2,4,2};
        
         
        // System.out.println(containsDuplicate(nums));
         System.out.println(containsDuplicate_hashset(nums));
    }
}




 
