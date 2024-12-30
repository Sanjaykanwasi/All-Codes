class Employee {
    private int id;
    private String name;

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }

    public void setid(int x) {
        id = x;
    }

    public int getid() {
        return id;
    }
}

public class modifier {
    public static void main(String[] args) {
        System.out.println("Lets Begin");
        Employee obj = new Employee();

        obj.setid(25);
        obj.setname("sam");

        System.out.println(obj.getid());
        System.out.println(obj.getname());

    }
}
