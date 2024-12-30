import java.util.Scanner;

class algo {
    public void code() {
        System.out.println("Enter the number you want to find = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                int s = i;
                System.out.println("Number is at index " + s);
            }
        }

    }
}

public class search {
    public static void main(String[] args) {

        algo obj = new algo();
        obj.code();
    }
}