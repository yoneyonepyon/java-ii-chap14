// 親クラスObjectのひし形クラスを作成
// 長方形(Rectangle)クラスとは親子関係はありません。■■■
public class Hisigata implements GetArea {
	int taikakusen1; // 対角線
	int taikakusen2; // 対角線

	public Hisigata(int taikakusen1, int taikakusen2) {
		super();
		this.taikakusen1 = taikakusen1;
		this.taikakusen2 = taikakusen2;
	}

	@Override
	public int getArea() {
		// ひし形の面積は、(対角線*対角線)/2 です。
		return (taikakusen1 * taikakusen2) / 2;
	}

	public static void main(String[] args) {
		Hisigata h = new Hisigata(100, 10);
		// 第１引数：対角線1
		// 第２引数：対角線2
		System.out.println("ひし形の面積は " + h.getArea());
	}
}
/*
 * ひし形の面積は 500
 */
