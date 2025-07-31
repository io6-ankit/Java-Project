public class ArrayorNot {
    public static void main(String[] args) {
        float[] marks = { 22.3f, 33.2f, 55.4f, 77.4f };
        float num = 33.33f;
        boolean isArray = false;
        for (float element : marks) {
            if (num == element) {
                isArray = true;
                break;
            }
        }
        if (isArray) {
            System.out.println(num + "this is include the number in marks array ");
        } else {
            System.out.println(num + "this is not include the number in marks array ");
        }
    }

}
