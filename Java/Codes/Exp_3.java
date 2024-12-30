import java.util.Scanner;

abstract class Account {
    double interestRate, amount;

    abstract double calculateInterest();
}

class MyException extends Exception {
    public MyException() {
        System.out.println("Invalid input!!");
        System.exit(0);
    }
}

class FDAccount extends Account {
    Scanner sc = new Scanner(System.in);
    double interestRate, amount;
    int days, age = 0;

    void input() {
        try {
            System.out.println("Enter amount (in Rs): ");
            amount = sc.nextInt();
            if (amount < 0)
                throw new MyException();
            System.out.println("Enter maturity period (in days): ");
            days = sc.nextInt();
            if (days < 0)
                throw new MyException();
            if (amount < 10000000) {
                System.out.println("Enter age (in years): ");
                age = sc.nextInt();
                if (age < 0)
                    throw new MyException();
            }
        } catch (MyException ex) {
        }
    }

    double calculateInterest() {
        double interest = 0;
        if (age != 0) {
            if (age > 60) {
                if (days >= 7 && days <= 14)
                    interestRate = 5.00;
                else if (days >= 15 && days <= 29)
                    interestRate = 5.25;
                else if (days >= 30 && days <= 45)
                    interestRate = 6.00;
                else if (days >= 46 && days <= 60)
                    interestRate = 7.50;
                else if (days >= 61 && days <= 184)
                    interestRate = 8.00;
                else if (days >= 185 && days <= 365)
                    interestRate = 8.50;
                else {
                    interestRate = 0;
                    System.out.println("Invalid maturity period");
                }
            } else {
                if (days >= 7 && days <= 14)
                    interestRate = 4.50;
                else if (days >= 15 && days <= 29)
                    interestRate = 4.75;
                else if (days >= 30 && days <= 45)
                    interestRate = 5.50;
                else if (days >= 46 && days <= 60)
                    interestRate = 7.00;
                else if (days >= 61 && days <= 184)
                    interestRate = 7.50;
                else if (days >= 185 && days <= 365)
                    interestRate = 8.00;
                else {
                    interestRate = 0;
                    System.out.println("Invalid maturity period");
                }
            }
        } else// amount>crore
        {
            if (days >= 7 && days <= 14)
                interestRate = 6.50;
            else if (days >= 15 && days <= 29)
                interestRate = 6.75;
            else if (days >= 30 && days <= 45)
                interestRate = 6.75;
            else if (days >= 46 && days <= 60)
                interestRate = 8.00;
            else if (days >= 61 && days <= 184)
                interestRate = 8.50;
            else if (days >= 185 && days <= 365)
                interestRate = 10.00;
            else {
                interestRate = 0;
                System.out.println("Invalid maturity period");
            }
        }
        interest = (interestRate * amount) / 100;
        return interest;
    }
}

class RDAccount extends Account {
    Scanner sc = new Scanner(System.in);
    double interestRate, amount;
    int months, age = 0;

    void input() {
        try {
            System.out.println("Enter amount (in Rs): ");
            amount = sc.nextInt();
            if (amount < 0)
                throw new MyException();
            System.out.println("Enter maturity period (in months): ");
            months = sc.nextInt();
            if (months < 0)
                throw new MyException();
            System.out.println("Enter age (in years): ");
            age = sc.nextInt();
            if (age < 0)
                throw new MyException();
        } catch (MyException ex) {
        }
    }

    double calculateInterest() {
        double interest = 0;
        if (age > 60) {
            if (months == 6)
                interestRate = 8.00;
            else if (months == 9)
                interestRate = 8.25;
            else if (months == 12)
                interestRate = 8.50;
            else if (months == 15)
                interestRate = 8.75;
            else if (months == 18)
                interestRate = 9.00;
            else if (months == 21)
                interestRate = 9.25;
            else {
                interestRate = 0;
                System.out.println("Invalid maturity period");
            }
        } else {
            if (months == 6)
                interestRate = 7.50;
            else if (months == 9)
                interestRate = 7.75;
            else if (months == 12)
                interestRate = 8.00;
            else if (months == 15)
                interestRate = 8.25;
            else if (months == 18)
                interestRate = 8.50;
            else if (months == 21)
                interestRate = 8.75;
            else {
                interestRate = 0;
                System.out.println("Invalid maturity period");
            }
        }
        interest = (interestRate * amount) / 100;
        return interest;
    }

}

class SBAccount extends Account {
    String type;

    void input() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter amount (in Rs): ");
            amount = sc.nextInt();
            if (amount < 0)
                throw new MyException();
            System.out.println("enter the type of account:-(NRI/Normal) ");
            type = sc.next();
        } catch (MyException ex) {
        }
    }

    double calculateInterest() {
        if (type.equalsIgnoreCase("NRI"))
            interestRate = 6.0;
        else
            interestRate = 4.0;
        double interest = (interestRate * amount) / 100;
        return interest;
    }
}

public class Exp_3 {
    public static void main(String[] args) {
        System.out.println("20BCS9291 Sanjay");
        Scanner sc = new Scanner(System.in);
        int c;
        double result;
        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. SB");
            System.out.println("2. FD");
            System.out.println("3. RD");
            System.out.println("Enter your choice: ");
            c = sc.nextInt();
            switch (c) {
                case 0:
                    System.exit(0);
                case 1:
                    SBAccount sb = new SBAccount();
                    sb.input();
                    result = sb.calculateInterest();
                    System.out.println("Interest is " + result);
                    break;
                case 2:
                    FDAccount fd = new FDAccount();
                    fd.input();
                    result = fd.calculateInterest();
                    System.out.println("Interest is " + result);
                    break;
                case 3:
                    RDAccount rd = new RDAccount();
                    rd.input();
                    result = rd.calculateInterest();
                    System.out.println("Interest is " + result);
                    break;
            }
        }
    }

}
