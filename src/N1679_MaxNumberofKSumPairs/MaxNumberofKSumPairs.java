package N1679_MaxNumberofKSumPairs;

import java.util.Arrays;

public class MaxNumberofKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1, result = 0;
        if(nums.length < 2 && nums[l] + nums[r] != k) return 0;
        while (l < r){
            if (nums[l] + nums[r] < k) l++;
            else if (nums[l] + nums[r] > k) r--;
            else {
                result++;
                l++;
                r--;
            }
        }
        return result;
    }
}
