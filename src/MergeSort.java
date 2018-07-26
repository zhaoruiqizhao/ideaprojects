public class MergeSort {
	public static void main(String[] args) {
	    int[] a = {1,2,5,7,9,4,2,45,7,65,3,2,2,2,5,60,0};
	    mergeSort(a, 0, a.length - 1);
	    for (int i : a) {
	    	System.out.print(i + "-");
		}
	}
	public static void mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a, start, mid, end);
		}
	}

	private static void merge(int[] a, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int k = 0;
		int i = start;
		int j = mid + 1;
		while (i <= mid && j <= end) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		while (j <= end) {
			temp[k++] = a[j++];
		}
		for (int p = 0; p < temp.length; p++) {
			a[start + p] = temp[p];
		}
	}
}
