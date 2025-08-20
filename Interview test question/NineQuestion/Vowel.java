
public class Vowel {
    public static void main(String[] args) {
        String name = "i love my  country ";
        name = name.toLowerCase();
        // String[] vowel = { "a", "e", "i", "o", "u" };
        System.out.println(name);
        int count = 0;
        ;
        for (int x = 0; x < name.length(); x++) {
            // System.out.print(name.charAt(x));
            char ch = name.charAt(x);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        System.out.println(count);
    }
}
