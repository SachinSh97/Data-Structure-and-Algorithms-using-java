/*
* Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
* 
* Input: nums = [-4,-1,0,3,10]
* Output: [0,1,9,16,100]
* Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
*/

import java.io.*;

 class Square{

    public static int[] squareSortedArray(String[] nums){
        int[] square = new int[nums.length];
        int start = 0, end = nums.length-1, index = nums.length-1;

        while(start<=end){
            int startNum = Integer.parseInt(nums[start]);
            int endNum = Integer.parseInt(nums[end]);

            if( Math.abs(startNum) > Math.abs(endNum) ){
                square[index] = startNum*startNum;
                start++;
            }else{
                square[index] = endNum*endNum;
                end--;
            }
            index--;
        }

        return square;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().trim().split(" ");
        int[] square = squareSortedArray(nums);
        System.out.println("Square of sorted array : ");
        for(int i=0;i<square.length;i++){
            System.out.print(square[i]+" ");
        } 
    }
 }