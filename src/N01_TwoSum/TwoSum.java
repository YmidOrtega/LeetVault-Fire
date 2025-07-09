package N01_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twosum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j= i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumHas(int[] nums, int target){
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int key = target - nums[i];
            if(numsMap.containsKey(key)){
                return new int[]{numsMap.get(key), i};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }


}
