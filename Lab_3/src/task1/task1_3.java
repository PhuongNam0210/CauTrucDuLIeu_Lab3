package task1;

public class task1_3 {
	private int[] arr;

	public task1_3(int[] arr) {
		this.arr = arr;
	}

	public int iterativeBinarySearch(int target) {
		int mid = arr.length / 2;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (target > arr[mid]) {
				right = mid - 1;
				mid = (right - left) / 2;
			}
			if (target < arr[mid]) {
				left = mid + 1;
				mid = arr.length - 1 - ((right - left) / 2);
			}
			if (target == arr[mid]) {
				return mid;
			}
			if (right == left && target == arr[mid]) {
				return right;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 50, 46, 37, 34, 29, 28, 17, 13, 10 };
		task1_3 m3 = new task1_3(arr);
		System.out.println((m3.iterativeBinarySearch(10)));
	}
}
