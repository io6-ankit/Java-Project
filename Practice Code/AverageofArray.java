public class AverageofArray {
    public static void main(String[] args) {
        float[] marks = { 33.2f, 33.4f, 54.2f, 52.7f, 76.4f, 88.4f };
        float sum = 0;
        float average = 0;
        for (float element : marks) {
            sum = sum + element;

        }
        System.out.println(sum + "Sum");
        average = sum / marks.length;
        System.out.println(average + "Average");
    }

}
