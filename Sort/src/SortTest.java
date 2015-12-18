
public class SortTest {
	// Ã°Åİ
	public static int[] bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			int temp = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;

	}

	// ²åÈë
	public static int[] insertSort(int[] arr) {
		int target = 0;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			target = arr[i];
			j = i;
			while (j > 0 && target < arr[j - 1]) {
				arr[j] = arr[j - 1];
				arr[j - 1] = target;
				j--;
			}
		}
		return arr;

	}

	// ÕÛ°ë²åÈëÅÅĞò
	public static int[] binaryInsertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int low = 0;
			int high = i - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (temp < array[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			for (int j = i; j >= low + 1; j--) {
				array[j] = array[j - 1];
			}
			array[low] = temp;
		}
		return array;
	}
	//¿ìËÙÅÅĞò
	public static int[] quickSort(int[] arr){
		int low;
		int high;
		
		return null;
	}
	public static void main(String[] args) {
		int[] arr = binaryInsertSort(new int[] { 9, 8, 6, 7, 4, 2, 1, 3, 5 });
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			System.out.print(temp);
		}

	}
}
