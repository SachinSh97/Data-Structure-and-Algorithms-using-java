/*
Given a binary array nums, return the maximum numbers of consecutive 1's in the array.

Example :- 
        Input : nums = [1,1,0,1,1,1]
        Output : 3
        Explanation : The first two digits or the last three digits are consecutive 1s. The maximum
                      Number of consecutive 1s is 3.

Constrants : 
    * 1 <= nums.length <=10^5.
    * nums[i] is either 0 or 1.
*/

import java.io.*;

class RemoveElement {

    public static int removeElement(int[] nums, int val){
        int[] res = new int[nums.length];
        int j=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                res[j] = nums[i];
                j++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i] = res[i];
        }
        
        return j;
    } 

    public static void main(String[] args) throws IOException{

        int[] nums = new int[]{3,2,2,3};
        int val = 2;
        removeElement(nums, val);
    }
}
