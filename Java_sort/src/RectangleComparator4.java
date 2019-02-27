import java.util.Comparator;

public class RectangleComparator4 implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		int a = o1.getArea();
		int b = o2.getArea();

		boolean c1 = a % 2 == 0 && b % 2 == 1;
		boolean c2 = a % 2 == 0 && b % 2 == 0 && a < b;
		boolean c3 = a % 2 == 1 && b % 2 == 1 && a > b;

		if (c1 || c2 || c3) {
			return -1;
		} else {
			return 0;
		}
	}

}
