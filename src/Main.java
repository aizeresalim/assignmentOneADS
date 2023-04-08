import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter task number - ");
        int taskNumber = sc.nextInt();


        switch (taskNumber) {
            case 1:
                task1.solve();
                break;
            case 2:
                task2.solve();
                break;
            case 3:
                task3.solve(args);
                break;
            case 4:
                task4.solve(args);
                break;
            default:
                System.out.println("Invalid task number");
                break;
        }
    }
}


