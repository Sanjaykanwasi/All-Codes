import java.util.*;

public class _13function {

    public static void printMyName(String nam) {
        System.out.println(nam);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name = ");
        String name = sc.nextLine();

        printMyName(name);

    }
}
