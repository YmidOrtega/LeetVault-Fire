package N1493_LongestSubarrayOf1sAfterDeletingOneElement;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int n = nums.length, maxLen = Integer.MIN_VALUE, left = 0, zeroCount = 0;
        for(int right = 0 ; right < n ; right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            while(zeroCount > 1){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen , right - left);
        }
        return maxLen;
    }
}

