package practice_tasks.basic_tasks;

public class task_11 {
    String evenodd_check(int num) {
        if (num % 2 == 0) {
            return "Even"; // Even
        } else {
            return "Odd"; // Odd
        }
    }
    public static void main(String[] args) {
        task_11 obj = new task_11();
        int num = 10;
        System.out.println("The number is: " + obj.evenodd_check(num));
    }
    
}
