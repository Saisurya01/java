package class_and_objects;

    public class person {
     String name="sai surya";
     int age=19;
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    public static void main(String[] args) {
        person p = new person();
        p.display();
    }
    }
