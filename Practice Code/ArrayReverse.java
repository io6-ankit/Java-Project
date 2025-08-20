import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] num = { 1, 3, 5, 6, 4 };
        int[] second = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            second[i] = num[num.length - 1 - i];

        }
        System.out.println(Arrays.toString(second));
    }

}
