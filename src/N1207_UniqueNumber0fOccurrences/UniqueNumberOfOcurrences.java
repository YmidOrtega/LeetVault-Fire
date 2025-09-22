package N1207_UniqueNumber0fOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOcurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        int range = max - min + 1;
        int[] freq = new int[range];
        for (int num : arr) {
            freq[num - min]++;
        }
        boolean[] seen = new boolean[arr.length + 1];
        for (int count : freq) {
            if (count > 0) {
                if (seen[count]) {
                    return false;
                }
                seen[count] = true;
            }
        }
        return true;
    }

    //SOLUTION 2
    public boolean uniqueOccurrences2(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for (int x : freq.values()) {
            s.add(x);
        }

        return freq.size() == s.size();
    }
}
