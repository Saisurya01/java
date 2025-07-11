package practice_tasks.basic_tasks;

public class task_16{
    public static void main(String[] args) {
       dog d = new dog();
       d.makesound();
       d.bark();
    }
    
}
class animal{
    void makesound(){
        System.out.println("Animal makes sound");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Dog barks");
    }
}