
public class test_cyclicrotateofarrayby1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int a[] = new int[n];
        a[0] = arr[n-1];

        for(int i=1; i<n; i++){
            a[i] = arr[i-1];
        }

        for(int j=0; j<n; j++){
            System.out.print(a[j] + " ");
        }
    }
    
}