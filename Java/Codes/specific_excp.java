import java.util.Scanner;

public class specific_excp {
    public static void main(String[] args) {
        int[] arr = { 100, 80, 70, 60, 50 };
        System.out.println("Enter the index of array = ");
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        System.out.println("Enter the number from which you want to divide the array = ");
        int num = sc.nextInt();

        try {
            System.out.println("The value of array is = " + arr[ind]);
            System.out.println("The Division is = " + arr[ind] / num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some Exception Occured");
            System.out.println(e);
        }
    }
}
