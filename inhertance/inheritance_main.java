package inhertance;

public class inheritance_main {
    public void display1() {
        System.out.println("This is the display method of inheritance_main class.");
    }
}
class inheritance_child extends inheritance_main {
    public void display2() {
        System.out.println("This is the overridden display method in inheritance_child class.");
    }
    public static void main(String[] args) {
        System.out.println("This is the main class for inheritance examples.");
        inheritance_main obj = new inheritance_main();
        obj.display1();
        inheritance_child child = new inheritance_child();
        child.display2();
    }

}
