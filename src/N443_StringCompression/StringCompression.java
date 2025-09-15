package N443_StringCompression;

public class StringCompression {
    public int compress(char[] chars) {
        int index = 0, start = 0;
        while(start < chars.length){
            int end = start;
            while (end < chars.length && chars[start] == chars[end]) {
                end++;
            }
            int count = end - start;
            chars[index++] = chars[start];
            if(count >= 2){
                char[] freq  = Integer.toString(count).toCharArray();
                for(char ch : freq) chars[index++] = ch;
            }
            start = end;
        }
        return index;
    }

    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(sc.compress(chars)); // Output: 6
    }

}
