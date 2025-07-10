package N27_RemoveElement;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int x = nums.length;

        if(x == 1 && nums[x-1] == val) return 0;
        int j = 0;

        for (int i = 0; i < x; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}
