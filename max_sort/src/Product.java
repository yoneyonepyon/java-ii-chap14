public class Product implements MaxComparable { // 商品クラス
	String name; // 商品の名前
	int price; // 商品の価格

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		Product pan = new Product("パン", 120); // 120 が価格です。
		Product onigiri = new Product("おにぎり", 180);// 180 が価格です。
		int max = MyMax.max(pan, onigiri); // (ﾛ)ここで二つのインスタンスの
											// 最大値を求めます。
		System.out.println("商品の中で価格の最大値＝" + max);// 180を出力
	}

	@Override
	public int compareValue() {
		return price;
	}
}
/*
 * 商品の中で価格が大きい値＝180
 */