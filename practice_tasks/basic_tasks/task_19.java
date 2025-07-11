package practice_tasks.basic_tasks;
import java.util.*;
public class task_19 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");    
        list.add("JavaScript");
        list.add("Ruby");
        System.out.println("Elements in the ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
