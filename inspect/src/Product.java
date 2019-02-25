// 商品クラス
public class Product implements DebugPrintable {
	String name; // 商品の名前
	int price; // 商品の価格

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		Product pan = new Product("パン", 120);
		MyInspector.inspect(pan);
		Product onigiri = new Product("おにぎり", 180);
		MyInspector.inspect(onigiri);
	}

	@Override
	public void debugPrint() {
		System.out.println("Productのインスタンス：の値　" + name + ", " + price);
	}
}
