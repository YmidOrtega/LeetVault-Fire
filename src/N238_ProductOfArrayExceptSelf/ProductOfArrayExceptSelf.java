package N238_ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int i = 0;
        int[] l = new int[nums.length], r = new int[nums.length];

        while(i < nums.length){
            if(nums[i] == 0){
                nums[i] = 1;
                for(int j = 0; j < nums.length; j++){
                    int multi = 1;
                    int res = multi * nums[j];
                    multi = res;
                }
            }
        }
        return result;
    }
}
