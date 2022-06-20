package FindPivotIndex_724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] left_sums = new int[n];
        int[] right_sums = new int[n];
        left_sums[0] = 0;
        right_sums[n-1] = 0;

        for (int i = 1; i<n; i++){
            left_sums[i] = nums[i-1] + left_sums[i-1];
        }
        for (int i = n-2; i>=0; i--){
            right_sums[i] = nums[i+1] + right_sums[i+1];
        }
        for (int i = 0; i<n; i++){
            if (left_sums[i] == right_sums[i]){
                return i;
            }
        }
        return -1;
    }

}
