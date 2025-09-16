package N283_MoveZeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) return;
        int index = 0;
        for(int i : nums){
            if (i != 0){
                nums[index++] = i;
            }
        }
        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
