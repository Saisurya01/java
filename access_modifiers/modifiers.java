package access_modifiers;

public class modifiers {
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
        modifiers mod = new modifiers();
        mod.sayhi();
        mod.saybye();
        mod.saywelcome();
    }
}
