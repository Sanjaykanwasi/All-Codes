import java.util.*;

public class _27_currency {

    public static void convertIntoIndianCurrency(String money) {

        int index = money.length() - 1;
        char last = money.charAt(index);

        String first = money.substring(0, index);

        int num = Integer.parseInt(first);

        switch (last) {
            case 'R':
                System.out.println(num * 50);
                break;

            case 'U':
                System.out.println(num * 80);
                break;

            case 'C':
                System.out.println(num * 30);
                break;  

            default:
                System.out.println("Invalid Currency");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Money with currency = ");
        String money = sc.nextLine();

        convertIntoIndianCurrency(money);
    }
}
