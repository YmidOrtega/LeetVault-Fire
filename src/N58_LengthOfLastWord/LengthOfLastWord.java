package N58_LengthOfLastWord;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String newString = s.trim();
        int x = newString.length(), y = 0;
        for(int i = x-1;i >= 0; i--){
            char letter = newString.charAt(i);
            if(letter == ' '){
                return y;
            }
            y++;
        }
        return y;
    }
}
