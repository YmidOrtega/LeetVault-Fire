package N69_SqrtX;

public class SqrtX {
    public int mySqrt(int x) {
        int l = 0, r = x, m = 0, answer = 0;
        while (l <= r){
            m = (r - l) / 2 + l;

            if((x / m) == m) return m;
            else if ((x / m) < m) r = m-1;
            else{
                l = m + 1;
                answer = m;
            }
        }
        return answer;
    }
}
