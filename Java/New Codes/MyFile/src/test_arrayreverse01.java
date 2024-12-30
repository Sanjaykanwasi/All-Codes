
public class test_arrayreverse01 {
    public static void main(String[] args) {
        int a[] = { 0, 2, 1, 2, 0 };
        int n = a.length;
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zero++;
            } else if (a[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        for (int j = 0; j < zero; j++) {
            a[j] = 0;
        }

        for (int k = zero; k < zero + one; k++) {
            a[k] = 1;
        }

        for (int l = zero + one; l < zero + one + two; l++) {
            a[l] = 2;
        }

        for (int m = 0; m < n; m++) {
            System.out.print(a[m] + " ");
        }
    }

}