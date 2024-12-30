import java.util.Arrays;

public class test_merge_sortedarray {
    public static void main(String[] args) {
        int nums1[] = { 9, 8, 7 };
        int nums2[] = { 3, 4, 1 };

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] > nums2[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                }
            }
        }
        Arrays.sort(nums2);

        int combarr[] = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combarr, 0, nums1.length);
        System.arraycopy(nums2, 0, combarr, nums1.length, nums2.length);

        for (int i = 0; i < combarr.length; i++) {
            System.out.print(combarr[i] + " ");
        }

    }
}