public class Sumoffloatnumber {

    public static void main(String[] args) {
        float[] marks = { 4.45f, 55.5f, 6.5f, 4.5f };
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println(sum);
    }

    // int[] num={1, 2, 4, 3, 5, 3}
    // for(int i = (num.length - 1);i<=0;i--)
    // {
    // System.out.println(num[i]);
    // }
}