import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparator1 implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		return o1.getArea() - o2.getArea();
		// 上記の説明
		// ComparableインタフェースのcompareToメソッドに合わせると、
		// 本メソッドの引数 o1 が自分で、
		// 引数 o2 が他人です。
	}

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
		Arrays.sort(rectangles);

		System.out.println("並べ替えた後");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.print(rectangles[i] + " ");
		}
		System.out.println("");

		// 以下、追加★
		// ソート処理１
		Arrays.sort(rectangles, new RectangleComparator1());
		System.out.println("並べ替えた後（１）：面積(3番目の項目)で昇順にソート");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.print(rectangles[i] + " ");
		}
		System.out.println("");
	}
}
