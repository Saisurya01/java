package practice_tasks.basic_tasks;

public class task_13 {
    String name;
    int age;
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        task_13 obj = new task_13();
        obj.name = "sai surya";
        obj.age = 19;
        obj.display();
    }
}
