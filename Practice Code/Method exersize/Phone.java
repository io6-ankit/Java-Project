class InnerPhone {
    public void ring() {
        System.out.println("Ringing---");
    }

    public void vibrate() {
        System.out.println("Vibrating--");
    }

    public void call(String name) {
        System.out.println("Calling" + name + "---");
    }
}

public class Phone {
    public static void main(String[] args) {
        InnerPhone cellPhone = new InnerPhone();
        cellPhone.ring();
        cellPhone.vibrate();
        cellPhone.call("Ankit");
    }
}
