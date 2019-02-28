public class Syain implements MaxComparable { // 社員クラス
	String name; // 社員の名前
	int age; // 社員の年齢

	public Syain(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String args[]) {
		Syain yamada = new Syain("山田", 25);// 25 が年齢です。
		Syain kimura = new Syain("木村", 30);// 30 が年齢です。
		int max = MyMax.max(yamada, kimura);// (ｲ)ここで二つのインスタンスの
											// 最大値を求めます。
		System.out.println("社員の中で年齢の最大値＝" + max);// 30を出力
	}

	@Override
	public int compareValue() {
		return age;
	}

}
/*
 * 社員の中で年齢が大きい値＝30
 */