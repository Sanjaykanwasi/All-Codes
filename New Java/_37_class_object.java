class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("WRITE SOMETHING");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class _37_class_object {
    public static void main(String[] args) {

        Pen obj1 = new Pen();
        obj1.color = "Red";
        obj1.type = "gel";
        obj1.write();
        obj1.printColor();

        Pen obj2 = new Pen();
        obj2.color = "blue";
        obj2.type = "ball";
        obj2.printColor();
        System.out.println();

        Student s1 = new Student("Sanjay", 22);
        s1.printInfo();
    }
}
