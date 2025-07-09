package N20_ValidParentheses;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> chars = new Stack();
        for (char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                chars.push(c);
            }else{
                if(chars.isEmpty()) return false;
                char popped = chars.pop();
                if(c == ')' && popped != '(') return false;
                if(c == '}' && popped != '{') return false;
                if(c == ']' && popped != '[') return false;
            }
        }
        return chars.isEmpty();
    }
}
