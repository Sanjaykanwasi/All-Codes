import java.util.ArrayList;

public class newintersec {
    public static void main(String[] args) {
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 3, 5 };
        int arr1[] = { 1, 3, 5, 7, 7, 9 };

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (!list.contains(arr1[i]))
                        list.add(arr1[i]);
                }
            }
        }

        System.out.println(list);

    }
}
