class Employee {
    int salary;
    String name;

    Employee() {
        salary = 1000;
        name = "unknown";
    }

    Employee(String empName) {
        name = empName;
        salary = 2000;
    }

    Employee(String empName, int basicSalary) {
        name = empName;
        salary = basicSalary;
    }

    public void display() {
        System.out.println("name:  " + name);
        System.out.println("Salary : " + salary);
    }

}

public class EmployeeSalary {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ankit");
        Employee e3 = new Employee("Maurya", 10000);

        e1.display();
        e2.display();
        e3.display();
    }
}