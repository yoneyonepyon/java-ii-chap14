
public class MyMaxHairetu {
	public static void main(String[] args) {
		Syain[] value = { new Syain("木村", 30), new Syain("山田", 25), new Syain("青木", 18) };
		// 配列numの最大値を求める
		int max = MyMaxHairetu.maxData(value);
		System.out.println("配列の最大値 = " + max);
	}

	private static int maxData(MaxComparable[] items) {
		int a = items[0].compareValue();

		for (MaxComparable b : items) {
			if (a != Math.max(a, b.compareValue())) {
				a = b.compareValue();
			}
		}

		return a;
	}
}