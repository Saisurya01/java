package practice_tasks.basic_tasks;

public class task_17 {
    public static void main(String[] args) {
        dog d = new dog();
        d.makesound();
        
    }
}
class animal {
    void makesound() {
        System.out.println("Animal makes sound");
    }
}
class dog extends animal {
    void makesound() {
        System.out.println("Dog barks");
    }
}