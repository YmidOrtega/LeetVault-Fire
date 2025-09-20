package N2215_FindTheDifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        boolean[] freq1 = new boolean[2001];
        boolean[] freq2 = new boolean[2001];
        for (int num : nums1) {
            freq1[num + 1000] = true;
        }
        for (int num : nums2) {
            freq2[num + 1000]= true;
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 2001; i++) {
            if (freq1[i]  && !freq2[i]) {
                list1.add(i - 1000);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 2001; i++) {
            if (freq2[i] && !freq1[i]) {
                list2.add(i - 1000);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;    
    }
}
