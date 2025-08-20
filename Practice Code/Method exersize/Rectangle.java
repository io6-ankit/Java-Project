class InnerRectangle {
    int l;
    int w;

    public void aria() {
        System.out.println("Aria");
    }

    public void perimeter() {
        System.out.println("Perimeter");
    }

    public int getLenght() {
        return l;
    }

    public int getWidth() {
        return w;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        InnerRectangle rectangle = new InnerRectangle();
        rectangle.l = 4;
        rectangle.w = 3;
        rectangle.aria();
        System.out.println(rectangle.getLenght() * rectangle.getWidth());
        rectangle.perimeter();
        System.out.println(2 * (rectangle.getLenght() + rectangle.getWidth()));
    }
}
