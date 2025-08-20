
public class ReverseString {
    public static void main(String[] args) {
        String name = "Ankit";

        for (int x = name.length() - 1; x >= 0; x--) {
            System.out.print(name.charAt(x));
        }
    }
}
