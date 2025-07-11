package Methods;

public class methods {
    // void method1()
    void method1() {
        System.out.println("Hello World");
    }
    //return type method
    int method2(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {

        methods obj = new methods();
        obj.method1();
        System.out.println(obj.method2(5, 10));
    }
}
