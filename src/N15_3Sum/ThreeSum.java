package N15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new ArrayList<>();
        Arrays.sort(nums);
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > 0) break;
            if (x > 0 && nums[x] == nums[x - 1]) continue;
            int l = x + 1, r = nums.length - 1, target = -nums[x];
            while (l < r){
                int currSum = nums[l] + nums[r];
                if (currSum < target) l++;
                else if (currSum > target) r--;
                else {
                    sums.add(Arrays.asList(nums[x], nums[l], nums[r]));
                    l++; r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                }
            }
        }
        return sums;
    }
}
