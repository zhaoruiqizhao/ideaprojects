import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo1 extends Demo2{

	private Boolean haha;
	private boolean xixi;

	public boolean isXixi() {
		return xixi;
	}

	public void setXixi(boolean xixi) {
		this.xixi = xixi;
	}

	public Boolean getHaha() {
		return haha;
	}

	public void setHaha(Boolean haha) {
		this.haha = haha;
	}

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.call();
	}

}
class Demo2 implements Callable<Integer>{


	@Override
	public Integer call() throws IllegalArgumentException {
		for (int i = 0; i < 4; i++) {
			System.out.println("+++++++++++++");
		}
		return 999;
	}
}