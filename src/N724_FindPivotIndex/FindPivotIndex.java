package N724_FindPivotIndex;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftsum = 0;
        for (int ele : nums)
            totalSum += ele;
        for (int i = 0; i < nums.length; leftsum += nums[i++])
            if (leftsum * 2 == totalSum - nums[i])
                return i;
        return -1;
    }
}
