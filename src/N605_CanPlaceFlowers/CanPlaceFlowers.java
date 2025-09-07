package N605_CanPlaceFlowers;

public class CanPlaceFlowers {
    //MENOS EFICIONTE
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                if((i == 0 ||flowerbed[i-1] == 0)&& (i == flowerbed.length - 1 || flowerbed[i+1] == 0)){
                    count++;
                    if (count == n) {
                        return true;                        
                    }
                    i++;
                }
            }
        }
        return false;
    }

    //MAS EFICIONTE
    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int length = flowerbed.length, i = 0;
        while(i<length && n>0){
            if(flowerbed[i]==1) i+=2;
            else if(i==length-1 || flowerbed[i+1]==0){
                n--;
                i+=2;
            }
            else{
                i+=3;
            }
            
        }
        return n<=0;
    }
}
