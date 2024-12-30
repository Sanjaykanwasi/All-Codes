public class recursion_7 {

    public static void moveallX(String str, int index, int count, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString = newString + 'x';
            }
            System.out.println(newString);
            return;
        }

        char currentchar = str.charAt(index);
        if (currentchar == 'x') {
            count++;
        } else {
            newString = newString + currentchar;
        }

        moveallX(str, index + 1, count, newString);

    }

    public static void main(String[] args) {
        String str = "axcxdx";
        moveallX(str, 0, 0, "");
    }
}
