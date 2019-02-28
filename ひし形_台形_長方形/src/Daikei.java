// 親クラスObjectの台形クラスを作成
// 長方形(Rectangle)クラスとは親子関係はありません。■■■
public class Daikei implements GetArea {
	int joutei; // 上底
	int katei; // 下底
	int takasa; // 高さ

	public Daikei(int joutei, int katei, int takasa) {
		super();
		this.joutei = joutei;
		this.katei = katei;
		this.takasa = takasa;
	}

	@Override
	public int getArea() {
		// 台形の面積は、(上底 + 下底)*高さ/2 です。
		return (joutei + katei) * takasa / 2;
	}

	public static void main(String[] args) {
		Daikei d = new Daikei(80, 20, 20);
		// 第１引数：上底
		// 第２引数：下底
		// 第３引数：高さ
		System.out.println("台形の面積は " + d.getArea());
	}
}
/*
 * 台形の面積は 1000
 */
