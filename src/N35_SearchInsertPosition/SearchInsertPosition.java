package N35_SearchInsertPosition;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int x = 0, y = nums.length - 1;
        while (x <=y){
            int mid = (x + y) / 2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]){
                x = mid + 1;
            }else {
                y = mid -1;
            }
        }
        return x;
    }
}
