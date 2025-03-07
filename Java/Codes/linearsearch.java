
class linearsearch {
	public static int search(int arr[], int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 3, 7, 9, 11, 13, 15, 17 };
		int x = 9;

		int result = search(arr, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + result);
	}
}
