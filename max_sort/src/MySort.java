import java.util.Arrays;
import java.util.Comparator;

public class MySort implements Comparator<MaxComparable> {

	public static void main(String[] args) {
		Syain[] value = { new Syain("木村", 30), new Syain("山田", 25), new Syain("青木", 18) };
		System.out.println("並べ替える前");
		for (int i = 0; i < value.length; i++) {
			System.out.print(value[i].age + " ");
		}
		System.out.println("");

		// ソート処理
		MySort.sort(value);

		System.out.println("並べ替えた後");
		for (int i = 0; i < value.length; i++) {
			System.out.print(value[i].age + " ");
		}
		System.out.println("");
	}

	private static void sort(MaxComparable[] items) {
		Arrays.sort(items, new MySort());
	}

	@Override
	public int compare(MaxComparable o1, MaxComparable o2) {
		return o1.compareValue() - o2.compareValue();
	}

}
