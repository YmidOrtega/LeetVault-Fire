package N643_MaximumAverageSubarrayI;

import java.util.Arrays;

public class MaximumAverageSubarrayI {
    //MI SOLUTION
    public double findMaxAverage1(int[] nums, int k) {
        double result = -Double.MAX_VALUE, average = 0;
        int numGroups = nums.length - k + 1, sum = 0; 
        for (int i = 0; i < numGroups; i++){
            for (int j = i; j < i + k; j++){
                sum += nums[j];
            }
            average = (double) sum / k;
            if (average > result) result = average;
            sum = 0;
        }
        return result;
    }

    //OPTIMIZED SOLUTION
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = i+k, sum = Arrays.stream(nums).limit(k).sum();
        double avg = (double) sum/k; 
        while(j<nums.length){
            sum += nums[j] - nums[i];
            avg = Math.max(avg, (double) sum/k);
            i++;
            j++;
        }
        return avg;
    }
}
