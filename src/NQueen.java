import java.util.HashMap;
import java.util.Map;

public class NQueen{

	public static void main(String[] args) {

	}
	public static int maxCountSeq(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				if (map.containsKey(arr[i] - 1)) {

				}
			}
		}
		// this is n queen!
		return 0;
	}
}
