public class MyMax {

	public static int max(MaxComparable a, MaxComparable b) {
		return Math.max(a.compareValue(), b.compareValue());
	}

}
