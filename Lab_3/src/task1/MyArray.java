package task1;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearchHelper(target, 0);
	}

	private int recursiveLinearSearchHelper(int target, int currentIndex) {
		if (currentIndex >= array.length) {
			return -1;
		}

		if (array[currentIndex] == target) {
			return currentIndex;
		}

		return recursiveLinearSearchHelper(target, currentIndex + 1);
	}

	public int iterativeBinarySearch(int target) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public int recursiveBinarySearch(int target) {
		return recursiveBinarySearchHelper(target, 0, array.length - 1);
	}

	private int recursiveBinarySearchHelper(int target, int left, int right) {
		if (left > right) {
			return -1;
		}
		int mid = left + (right - left) / 2;
		if (array[mid] == target) {
			return mid;
		} else if (array[mid] < target) {
			return recursiveBinarySearchHelper(target, mid + 1, right);
		} else {
			return recursiveBinarySearchHelper(target, left, mid - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 10, 9, 45, 2, 10, 10, 45 };

		MyArray re1 = new MyArray(arr);
		MyArray re2 = new MyArray(arr);
		MyArray re3 = new MyArray(arr);
		MyArray re4 = new MyArray(arr);

		System.out.println(re1.iterativeLinearSearch(45));
		System.out.println(re2.recursiveLinearSearch(15));
		System.out.println(re3.iterativeLinearSearch(10));
		System.out.println(re4.recursiveBinarySearch(15));
	}

}
