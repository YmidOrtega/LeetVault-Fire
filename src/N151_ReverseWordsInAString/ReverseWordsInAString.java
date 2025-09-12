package N151_ReverseWordsInAString;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        if(s == null) return null;
        char[] charArray = s.toCharArray();
        char[] revSt = new char[s.length()];
        int ind = reverse(charArray,revSt,0);
        return new String(revSt,0,ind);
    }
    public int reverse(char[] ch,char[] rev,int start){
        while(start < ch.length && ch[start] == ' ') {
            start++;
        }
        int end = start;
        while(end<ch.length && ch[end] != ' ') {
            end++;
        }
        if(start == end) return 0;
        int len = reverse(ch,rev,end);
        if(len != 0) {
            rev[len++] = ' ';
        }
        while(start < end) {
            rev[len++] = ch[start++];
        }
        return len;
    }
}
