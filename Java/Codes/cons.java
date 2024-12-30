
class Myemo {
    private int id;
    private String name;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    public int getid() {
        return id;
    }

    public void setid(int x) {
        id = x;
    }

    public Myemo() {
        id = 45;
        name = "Samjay";
    }

    public Myemo(int myid) {
        id = 42;
        name = "Samjay";
    }

    public Myemo(String myname) {
        id = 45;
        name = myname;
    }

    public Myemo(int sid, String sname) {
        id = sid;
        name = sname;
    }
}

public class cons {
    public static void main(String[] args) {

        Myemo obj = new Myemo("SA");
        System.out.println(obj.getid());
        System.out.println(obj.getname());

    }
}
