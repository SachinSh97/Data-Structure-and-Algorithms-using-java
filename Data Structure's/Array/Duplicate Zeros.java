/* 
* Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
* Input : arr = [1,0,2,3,0,4,5,0]
* Output : [1,0,0,2,3,0,0,4]
*/

import java.io.*;

 class DuplicateZeros{

    public static String[] duplicate(String[] arr){
        String[] res = new String[arr.length];
        int i=0,j=0;
        
        while(j<arr.length){
            if( Integer.parseInt(arr[i])==0 && j<arr.length-1 ){
                res[j] = "0";
                res[j+1] = "0";
                j = j+2;
            }else{
                res[j]=arr[i];
                j++;
            }            
            i++;
        }
        
        return res;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().trim().split(" ");
        String[] res = duplicate(nums);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
 }