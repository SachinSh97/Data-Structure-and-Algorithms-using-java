/* 
* Given an array nums of integers, return how many of them contain an even number of digits
* Input : nums =[12,345,2,6,7896] 
* Output : 2
*/

import java.io.*;

 class EvenNumber{

    public static int CheckEvenDigits(String[] nums){
        int count = 0;

        for(int i=0;i<nums.length;i++){
            int temp = Integer.parseInt(nums[i]), digits=0 ;
            while(temp>0){
                temp = temp/10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().trim().split(" ");
        System.out.println("Numbers with Even number of digits : " + CheckEvenDigits(nums));
    }
 }