package N1004_MaxConsecutiveIII;

public class MaxConsecutiveIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, maxOnes = 0, zeroCount = 0;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxOnes = Math.max(maxOnes, right - left + 1);
        }
        return maxOnes;
    }
}
