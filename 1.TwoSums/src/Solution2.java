import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dic = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            dic.put(nums[i], i);
        }

        for(int i = 0; i<nums.length; i++){
            int requiredNumber = target - nums[i];
            if(dic.containsKey(requiredNumber) && dic.get(requiredNumber) != i){
                return new int[]{i, dic.get(requiredNumber)};
            }
        }
        throw new IllegalArgumentException("Not found");
    }
}
