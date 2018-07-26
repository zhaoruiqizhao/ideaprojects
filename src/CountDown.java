import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class CountDown {
	public static List<String> list = new ArrayList<>();
	public static Vector<Integer> listInt = new Vector<>();

	public static void addNum(int line, CountDownLatch latch) {
		//System.out.print(Thread.currentThread().getName() + "进行相加--");
		String s = list.get(line);
		String[] ss = s.split(",");
		int total = 0;
		for (int i = 0; i < ss.length; i++) {
			total += Integer.valueOf(ss[i]);
			listInt.add(total);
		}
		System.out.println(line + 1 + "行的结果为" + total + "----" + Thread.currentThread().getName());
		latch.countDown();
	}

	public static int readFile() throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("F:\\cc.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line = null;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		return list.size();
	}
	public static void main(String[] args) {
		int num = 0;
		try {
			num = readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		CountDownLatch latch = new CountDownLatch(num);

		for (int i = 0; i < num; i++) {
			final int j = i;
			new Thread(new Runnable() {
				@Override
				public void run() {
					CountDown.addNum(j, latch);
				}
			}).start();
		}
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int total = 0;
		for (int i = 0; i < listInt.size(); i++) {
			total += listInt.get(i);
		}
		System.out.println("total num is : " + total);
	}

}
