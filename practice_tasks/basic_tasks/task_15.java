package practice_tasks.basic_tasks;


public class task_15 {
     public void sayhi(){
        System.out.println("Hello, Sai Surya!");
    }
    private void saybye(){
        System.out.println("Goodbye, Sai Surya!");
    }
    protected void saywelcome(){
        System.out.println("Welcome, Sai Surya!");
    }
    public static void main(String[] args) {
        task_15 mod = new task_15();
        mod.sayhi();
        mod.saybye();
        mod.saywelcome();
    }
}
