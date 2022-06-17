/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Example :- 
        Input : nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output : [1,2,2,3,5,6]
        Explanation : The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    nums1.length == m + n
    nums2.length == n
    0 <= m, n <= 200
    1 <= m + n <= 200
    -109 <= nums1[i], nums2[j] <= 109
*/


import java.io.*;

class ConsecutiveOne{

    public static int[] mergeSortedArray(int[] nums1, int m, int[] nums2 ,int n){
        int [] temp = new int[m+n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
        while (i < m) {
            temp[k++] = nums1[i++];
        }
        while (j < n) {
            temp[k++] = nums2[j++];
        }

        return temp;
    }

    public static void main(String[] args) throws IOException{
        int[] res = new int[6];
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        res = mergeSortedArray(nums1, 3, nums2, 3);
        for(int i=0;i<6;i++){
            System.out.println(res[i]);
        }
    }

}