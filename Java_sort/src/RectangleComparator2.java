import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparator2 implements Comparator<Rectangle> {

	public static void main(String[] args) {
		Rectangle[] rectangles = {
				new Rectangle(91, 21), new Rectangle(23, 31),
				new Rectangle(51, 31), new Rectangle(70, 2),
				new Rectangle(30, 30), new Rectangle(80, 10) };

		System.out.println("並べ替える前");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.print(rectangles[i] + " ");
		}
		System.out.println("");

		// ソート処理
		Arrays.sort(rectangles, new RectangleComparator2());

		System.out.println("並べ替えた後");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.print(rectangles[i] + " ");
		}
		System.out.println("");
	}

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		return o2.getArea() - o1.getArea();
	}

}
