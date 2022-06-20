package RunningSumof1dArray_1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            array[i] = sum;
        }
        return  array;
    }
}
