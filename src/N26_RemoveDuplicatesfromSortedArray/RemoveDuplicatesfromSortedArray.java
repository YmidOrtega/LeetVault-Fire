package N26_RemoveDuplicatesfromSortedArray;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int x = nums.length;

        if(x == 1) return 1;
        int j = 1;

        for (int i = 1; i < x ; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}