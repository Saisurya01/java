package practice_tasks.basic_tasks;

public class task_6 {
    public static void main(String[] args) {
        int a = 10;
        if(a<18){
            System.out.println("You are a minor.");
        }
        else if(a>=18 && a<60){
            System.out.println("You are an adult.");
        } else{
            System.out.println("You are a senior.");
        }
    }
}
