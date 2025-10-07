package N746_MinCostClimbingStairs;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n2 = cost[0], n1 = cost[1];
        for(int i = 2; i < cost.length; i++){
            int curr = cost[i] + Math.min(n2,n1);
            n2 = n1;
            n1 = curr;
        }
        return Math.min(n1,n2);
    }
}
