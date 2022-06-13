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

class ConsecutiveOne{

    public static int MaxConsecutiveOne(String[] nums){
        int max_count = 0, local_max_count = 0 ;

        for(int i=0;i<nums.length;i++){
            if(Integer.parseInt(nums[i]) == 1){
                local_max_count++;
                continue;
            }
            if(max_count<local_max_count){
                max_count = local_max_count;
            }
            local_max_count = 0;
        }
        if(max_count<local_max_count){
            max_count = local_max_count;
        }
        return max_count;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int TestCase = Integer.parseInt(reader.readLine());

        for(int i=0; i<TestCase; i++){
            String[] nums = reader.readLine().trim().split(" ");
            System.out.println("Max Consecutive One's : " + MaxConsecutiveOne(nums));
        }
    }

}