package N11_ContainerWithMostWater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, result = 0;
        while(l<r){
           int x = (Math.min(height[l], height[r]) * (r-l));
           result = Math.max(result, x);
           if(height[l] < height[r]) l++;
           else r--; 
        }
        return result;
    }
}
