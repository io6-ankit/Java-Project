class InnerSquare {
    int s;

    public void perimeter() {
        System.out.println("Perimeter:");
    }

    public void aria() {
        System.out.println("Aria:");
    }

    public int gets() {
        return s;
    }

}

public class Square {
    public static void main(String[] args) {
        InnerSquare square = new InnerSquare();
        square.s = 5;
        square.perimeter();
        System.out.println(4 * square.gets());
        square.aria();
        System.out.println(square.gets() * square.gets());
    }
}
