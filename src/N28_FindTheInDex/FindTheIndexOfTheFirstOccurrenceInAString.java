package N28_FindTheInDex;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    /**
     * Solution 1
     */
    public int strStr(String haystack, String needle) {
        int x = haystack.length(), y = needle.length();
        if (haystack.isEmpty() && needle.isEmpty()) return -1;
        if (y > x) return -1;

        for (int i = 0; i < x + 1 - y; i++){
            for(int j= 0; j < y; j++){
                if (haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
                if (j == needle.length() - 1){
                    return i;
                }

            }

        }
        return -1;
    }

    /**
     * Solution 2
     */
    public int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
