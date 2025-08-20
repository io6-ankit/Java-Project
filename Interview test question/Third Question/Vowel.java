
public class Vowel {
    public static void main(String[] args) {
        String name = "Ankit";
        String firstVowel = "a";
        String secondVowel = "e";
        String thirdVowel = "i";
        String fourthVowel = "o";
        String fivethVowel = "u";
        for (int x = name.length() - 1; x >= 0; x--) {
            System.out.println(name.charAt(x));
            if (firstVowel.equals(name.charAt(x))) {
                System.out.println(name.charAt(x));
            } else if (secondVowel.equals(name.charAt(x))) {
                System.out.println(name.charAt(x));
            } else if (thirdVowel.equals(name.charAt(x))) {
                System.out.println(name.charAt(x));
            } else if (fourthVowel.equals(name.charAt(x))) {
                System.out.println(name.charAt(x));
            } else if (fivethVowel.equals(name.charAt(x))) {
                System.out.println(name.charAt(x));
            }
        }
    }
}
