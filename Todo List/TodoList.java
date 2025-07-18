import java.util.Scanner;
import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        boolean b = true;
        do {
            System.out.println("Enter your choice \n add \n delete \n show");
            String ch = sc.next();
            switch (ch) {
                case "add":
                    System.out.println("Enter name");
                    String name = sc.next();
                    al.add(name);
                    break;
                case "delete":
                    System.out.println("Enter no which you want to delete");
                    int t = sc.nextInt();
                    if (t < al.size() && t > 0) {
                        name = al.remove(t - 1);
                        System.out.println(name + " delete Successfully");
                    } else {
                        System.out.println("Element not Found");
                    }
                    break;
                case "show":
                    if (al.isEmpty()) {
                        System.out.println("No names found");
                    } else {
                        System.out.println("All name are :");
                        for (String i : al) {
                            System.out.println(i);
                        }
                    }
                    break;

                default:
                    break;
            }
            System.out.println("Enter the true for continue");
            b = sc.nextBoolean();
        } while (b);
    }

}
