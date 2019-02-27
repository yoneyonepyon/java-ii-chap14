import java.util.Arrays;

public class Rectangle implements Comparable<Rectangle> {
	int width;
	int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	int getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "[" + width + ", " + height + ", " + getArea() + "]";
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
		// ソート処理2
		Arrays.sort(rectangles, new RectangleComparator2());
		System.out.println("並べ替えた後（２）：面積(3番目の項目)で降順にソート");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.print(rectangles[i] + " ");
		}
		System.out.println("");
		// ソート処理3
		Arrays.sort(rectangles, new RectangleComparator3());
		System.out.println("並べ替えた後（３）：幅(1番目の項目)で降順にソート");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.print(rectangles[i] + " ");
		}
		System.out.println("");
		// ソート処理4
		Arrays.sort(rectangles, new RectangleComparator4());
		System.out.println("並べ替えた後（４）：面積(3番目の項目)で複雑にソート");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.print(rectangles[i] + " ");
		}
		System.out.println("");
		// ソート処理(無名クラス)
		Arrays.sort(rectangles, (a, b) -> a.width - b.width);
		System.out.println("並べ替えた後（５）：width (1番目の項目)で昇順にソート");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.print(rectangles[i] + " ");
		}
		System.out.println("");
	}

	@Override
	public int compareTo(Rectangle o) {
		return width - o.width;
	}
}
