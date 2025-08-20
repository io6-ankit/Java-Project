
public class PalindronString {
    public static void main(String[] args) {
        String name = "tnt";
        String reversename = "";
        for (int x = name.length() - 1; x >= 0; x--) {
            reversename += name.charAt(x);
        }
        System.out.println(reversename);
        if (name.equals(reversename)) {
            System.out.println("Name is Palindrom String");
        } else {
            System.out.println("Name is not Palindron String");
        }
    }
}
