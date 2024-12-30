class Student {
    String name;
    int age;

    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printinfo(int age) {
        System.out.println(age);
    }

    public void printinfo(String name, int age){
        System.out.println(name + " " + age);
    }
}


public class cpolymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printinfo("Aman");
        s1.printinfo(21);
        s1.printinfo("Sanjay", 22);

    }
}
