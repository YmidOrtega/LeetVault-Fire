package N02_AddTwoNumbers;

public class AddTwoNumbers {
    public int[] addTwoNumbers(int[] l1, int[] l2) {
        String num1 = "";
        String num2 = "";
        for (int j : l1) {
            num1 = num1 + j;
        }
        for (int i : l2) {
            num2 = num2 + i;
        }
        System.out.println(num1);
        System.out.println(num2);

        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.println(sum);


        return convertToArray(sum);


    }

    private int[] convertToArray(int sum) {
        String sumString = String.valueOf(sum);
        int[] result = new int[sumString.length()];
        for (int i = 0; i < sumString.length(); i++) {
            result[i] = Character.getNumericValue(sumString.charAt(i));
        }
        return result;
    }
}
