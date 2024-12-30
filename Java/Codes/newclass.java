class Employee {
    int id;
    int salary;
    String name;

    public void display() {
        System.out.println("The id is =" + id);
        System.out.println("The salary is =" + salary);
        System.out.println("Name is =" + name);
    }

}

public class newclass {
    public static void main(String[] args) {
        System.out.println("Welcome To the Program");
        Employee obj = new Employee();
        Employee obj2 = new Employee();

        obj.id = 45;
        obj.salary = 56000;
        obj.name = "Sanjay";

        obj2.id = 50;
        obj2.salary = 45000;
        obj2.name = "Ajay";

        obj.display();
        obj2.display();
    }

}
