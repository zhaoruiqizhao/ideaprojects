import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HeapSort extends product {

	public static void main(String[] args) {
		product.ss(new Integer(10));
	}

}
class product {
	public static final String S = "sldkfjsdl";

	static {
		System.out.println("类被加载");
	}

	public static void ss(int i) {
		System.out.println("11111");
	}
	public static void ss(Integer i) {
		System.out.println("22222");
	}
}