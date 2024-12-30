import java.util.*;

public class _25_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Firstname = ");
        String firstname = sc.nextLine();
        System.out.print("Enter Lastname = ");
        String lastname = sc.nextLine();

        String fullname = firstname + " " + lastname;

        System.out.println(fullname);

        System.out.println(fullname.length());

        // charAt

        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i) + " ");
        }
    }
}
