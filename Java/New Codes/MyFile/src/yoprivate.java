class Accounts {
   public String name;
   protected double number;
   private String Password;

   public void setPassword(String s) {
    this.Password = s;
   }

   public String getPassword() {
        return this.Password;
   }

   public void display(){
    System.out.println(this.name);
    System.out.println(this.number);
    System.out.println(getPassword());
   }
}

public class yoprivate {
    public static void main(String[] args) {
        Accounts sam = new Accounts();
        sam.name = "Sam";
        sam.number = 9761;
        sam.setPassword("Sanjay");
        sam.display();
    }
}
