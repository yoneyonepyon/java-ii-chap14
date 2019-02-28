// 親クラスObjectのひし形クラスを作成
// 長方形(Rectangle)クラスとは親子関係はありません。■■■
public class Triangle implements GetArea {
	int teihen; // 底辺
	int takasa; // 高さ

	public Triangle(int teihen, int takasa) {
		super();
		this.teihen = teihen;
		this.takasa = takasa;
	}

	@Override
	public int getArea() {
		// 三角形の面積は、(底辺*高さ)/2 です。
		return (teihen * takasa) / 2;
	}

	public static void main(String[] args) {
		Triangle h = new Triangle(100, 40);
		// 第１引数：底辺1
		// 第２引数：高さ
		System.out.println("三角形の面積は " + h.getArea());
	}
}
/*
 * 三角形の面積は 2000
 */
