public class QuickSort {
	public static void main(String[] args) {
		int[] a = {1,2,7,6,45,2,87,0,4,7};
		quickSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.print(i + "-");
		}
	}

	public static void quickSort(int[] a, int start, int end) {
		if (start < end) {
			int mid = getMid(a, start, end);
			quickSort(a, start, mid);
			quickSort(a, mid + 1, end);
		}
	}

	private static int getMid(int[] a, int start, int end) {
		int temp = a[start];
		int i = start;
		int j = end;
		while (i < j) {
			while (i < j && a[j] >= temp) {
				j--;
			}
			a[i] = a[j];
			while (i < j && a[i] <= temp) {
				i++;
			}
			a[j] = a[i];
		}
		a[i] = temp;
		return i;
	}
}
