
public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String name = "Programming";
        String result = "";
        for (int x = 0; x < name.length(); x++) {
            char c = name.charAt(x);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        System.out.println(result);
    }
}
