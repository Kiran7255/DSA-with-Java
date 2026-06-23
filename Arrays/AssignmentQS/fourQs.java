//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and number[index2] where 1 <= index1 <= numbers.length.
//Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1,index2] of length 2.
// The tests are generated such taht there is exactily one solution. You may not use the same element twice.
// Your solution must use only constant extrea space.

import java.util.Arrays;
public class fourQs {
    public static int[] sumintwo(int number[],int target){
        int left=0; int right = number.length-1;

        while (left<right) {
            int sum = number[left]+number[right];

        if(sum == target){
            return new int[]{left+1, right+1};
        }else if(sum<target){
            left++;
        }else{
            right--;
        }
    }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int number[]={1,6,8,12,14,20,24};
        System.out.println(Arrays.toString(sumintwo(number, 22)));
    }    
}
