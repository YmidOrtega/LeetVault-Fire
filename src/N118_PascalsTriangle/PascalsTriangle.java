package N118_PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp = GenerateRow(i);
            result.add(temp);
        }
        return result;
    }

    public static List<Integer> GenerateRow(int row){
        List<Integer> result = new ArrayList<>();
        long res = 1;
        result.add(1);
        for(int i = 1; i < row; i++){
            res = res * (row - i);
            res = res / i;
            result.add((int)res);
        }
        return result;
    }
}
