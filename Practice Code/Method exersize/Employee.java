class InnerEmployee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class Employee {
    public static void main(String[] args) {
        InnerEmployee ankit = new InnerEmployee();
        ankit.setName("Ankit Maurya");
        System.out.println(ankit.getName());
        System.out.println("gvfdvbdfbgfbgd");
        ankit.salary = 32312;
        System.out.println(ankit.getSalary());
    }

}
