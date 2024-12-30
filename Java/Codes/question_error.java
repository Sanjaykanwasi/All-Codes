import java.util.Scanner;

public class question_error {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Enter the index of the array = ");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                int index = sc.nextInt();
                System.out.println("The vale at index" + " " + index + " " + "is = " + arr[index]);
                flag = false;
            } catch (Exception e) {
                System.out.println("Sorry");
            }
        }

    }
}
