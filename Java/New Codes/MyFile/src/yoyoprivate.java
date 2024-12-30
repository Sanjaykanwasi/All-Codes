class Accounts {
    public String name;
    protected double number;
    private String Password;
 
    public String getPassword() {
        return this.Password;
    }

    private void setPassword(String s) {
        this.Password = s; 
    }
 
    public void display(){
     System.out.println(this.name);
     System.out.println(this.number);
     System.out.println(getPassword());
    }
 }
 
 public class yoyoprivate {
     public static void main(String[] args) {
         Accounts sam = new Accounts();
         sam.name = "Sam";
         sam.number = 9761;
         sam.display();
     }
 }
 