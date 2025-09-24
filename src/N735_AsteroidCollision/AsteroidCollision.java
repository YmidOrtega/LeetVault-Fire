package N735_AsteroidCollision;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    //SOLUCION 1
    public int[] asteroidCollision1(int[] nums) {
        int N = nums.length;
        Stack<Integer> stack = new Stack<>();
        for(int index = 0; index < N; index++){
            int num = nums[index];
            if(num > 0){
                stack.push(num);
            }else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -num){
                    stack.pop();
                }
                if(stack.isEmpty()|| (stack.peek() < 0 && num < 0)){
                    stack.push(num);
                }
                if(stack.peek() == -num){
                    stack.pop();
                }
            }
        }
        int result[] = new int[stack.size()];
        int index = stack.size() - 1;
        while(!stack.isEmpty()){
            result[index--] = stack.pop();
        }
        return result;
    }

    //SOLUCION 2
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        List<Integer> st = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(asteroids[i] > 0) st.add(asteroids[i]);
            else {
                while(!st.isEmpty() && st.get(st.size() - 1) > 0 && st.get(st.size() - 1) < Math.abs(asteroids[i])) st.remove(st.size() - 1);
                if(!st.isEmpty() && st.get(st.size() - 1) == Math.abs(asteroids[i])) st.remove(st.size() - 1);
                else if(st.isEmpty() || st.get(st.size() - 1) < 0) st.add(asteroids[i]);
            }
        }
        int[] res = new int[st.size()];
        for(int i = 0; i < st.size(); i++) res[i] = st.get(i);
        return res;
    }
}
