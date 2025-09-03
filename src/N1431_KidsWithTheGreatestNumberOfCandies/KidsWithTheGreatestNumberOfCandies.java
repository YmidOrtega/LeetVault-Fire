package N1431_KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i = 0, maxCandies = 0;
        ArrayList<Boolean> result = new ArrayList<>();
        while (i < candies.length){
            if(candies[i] > maxCandies){
                maxCandies = candies[i];
            }
            i++;
        }

        for(int j = 0; j < candies.length; j++){
            if(maxCandies <= (candies[j] + extraCandies)){
                    result.add(true); 
            }else {
                result.add(false);
            }
        }
        return result;    
    }
}
