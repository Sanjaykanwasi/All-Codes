import java.util.Scanner;

class ashu {
    public void run() {
        int[] arr = { 10, 20, 30, 40, 50 };

        boolean flag = true;

        while (flag) {
            try {
                System.out.print("Enter the index of array = ");
                Scanner sc = new Scanner(System.in);
                int ind = sc.nextInt();
                System.out.println("The array is = " + arr[ind]);
                flag = false;
            } catch (Exception e) {
                System.out.println("Array out of indix bitch!!!!");
            }
        }
    }
}

public class tryexercise {
    public static void main(String[] args) {
        ashu obj = new ashu();
        obj.run();
    }
}
