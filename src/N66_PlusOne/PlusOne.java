package N66_PlusOne;

public class PlusOne {
    // SOLUTION REAL.
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    // SOLUTION FOR SMALL NUMBERS.
    public int[] plusOne1(int[] digits) {
        if (digits.length == 1 && digits[digits.length-1] <= 8){
            int[] result = new int[digits.length];
            result[0] = digits[0] + 1 ;
            return result;
        }else {
            String num ="";
            for (int i = 0; i <= digits.length-1; i++){
                num += String.valueOf(digits[i]);
            }
            int incrementNum = Integer.valueOf(num) + 1;
            String incrementNumString = String.valueOf(incrementNum);
            int[] result = new int[incrementNumString.length()];
            for (int j = 0; j <= incrementNumString.length()-1 ; j ++){
                result[j] = Integer.valueOf(String.valueOf(incrementNumString.charAt(j)));

            }
            return result;
        }
    }
}

