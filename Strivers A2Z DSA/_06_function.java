public class _06_function {
    // Function to add two numbers
    public static int add(int a, int b){
        return a + b;
    } 
    public static void main(String[] args){
        System.out.println("Hello, World!");

        int a = 5;
        int b = 10;

        int result = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is " + result);
    }
}
