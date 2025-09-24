package N2390_RemovingStarsFromAString;

public class RemovingStarsFromAString {
    public String removeStars(String s) {
        int star = 0, i = s.length();
        StringBuilder sb = new StringBuilder();
        while (i-- > 0) {
            if (s.charAt(i) == '*') star++;
            else if (star == 0) sb.append(s.charAt(i));
            else star--;
        }
        return sb.reverse().toString();
    }
}
