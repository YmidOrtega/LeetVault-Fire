package N392_IsSubsequence;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int w1 = s.length(), w2 = t.length(), current = 0, index = 0;
        if (w1 > w2) return false;
        if (s.isEmpty() || t.isEmpty()) return true;
        while(index < w2){
            if (current == w1) return true;

            char ch1 = s.charAt(current), ch2 = t.charAt(index);
            if(ch1 == ch2) current++;
            index++;
        }
        if (current == w1) return true;
        else return false;
    }
}
