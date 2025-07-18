package N70_ClimbingStairs;

public class ClimbingStairs {
    public int climbStairs(int n) {

        int pre = 1,answer = 1;

        if (n == 0 || n == 1) return 1;

        for (int i = 2; i <= n; i++){
            int temp = pre + answer;
            pre = answer;
            answer = temp;
        }
        return answer;
    }
}
