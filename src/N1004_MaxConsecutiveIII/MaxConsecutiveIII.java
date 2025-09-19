package N1004_MaxConsecutiveIII;

public class MaxConsecutiveIII {
    public int longestOnes(int[] nums, int k) {
        int maxNums = 0, l = 0, r = 0;
        while (l < nums.length){
            if(nums[l] == 0) k--;
            if(k < 0){
                if(nums[r] == 0)k++;
                r++;
            }
            l++;
        }
        return l-r;
    }
}
