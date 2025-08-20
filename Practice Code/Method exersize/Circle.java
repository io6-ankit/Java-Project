class InnerCircle {
    float r;

    public void aria() {
        System.out.print("Circle Aria :  ");
    }

    public void perimeter() {
        System.out.print("Circle Perimeter :  ");
    }

    public double getRadius() {
        return r;
    }
}

public class Circle {
    public static void main(String[] args) {
        InnerCircle circle = new InnerCircle();
        circle.aria();
        circle.r = 3;
        System.out.println(22 / 7 * (circle.getRadius() * circle.getRadius()));
        circle.perimeter();
        System.out.println(2 * 22 / 7 * circle.getRadius());
    }
}
