
class InnerTommyvecetti {
    public void hitting() {
        System.out.println("Hitting---");
    }

    public void running() {
        System.out.println("Running---");
    }

    public void firing() {
        System.out.println("Firing---");
    }
}

public class Tommyvecetti {
    public static void main(String[] args) {
        InnerTommyvecetti tommy = new InnerTommyvecetti();
        tommy.hitting();
        tommy.running();
        tommy.firing();
    }
}
