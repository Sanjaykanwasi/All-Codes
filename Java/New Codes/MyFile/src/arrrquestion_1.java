import java.util.HashMap;

public class arrrquestion_1 {

    public static int[] twoSum(int arr[], int value) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // adding vales in hash map
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        // Searching for paris
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int rem = value - number;

            if (map.containsKey(rem)) {
                int index = map.get(rem);
                if (index == i)
                    continue;
                return new int[] { i, index };

            }

        }
        return new int[] {};
    }

    // Main Function
    public static void main(String[] args) {
        int arr[] = { 0, 2, 4, 7, 5, 9 };
        int target = 9;
        twoSum(arr, target);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
