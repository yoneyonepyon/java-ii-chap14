import java.io.PrintWriter;

// 商品クラス
public class Product implements MultiDebugPrintable {
	String name; // 商品の名前
	int price; // 商品の価格

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		Product pan = new Product("パン", 120);
		MyInspectorTCP_IP.inspect(pan, "127.0.0.1");
		Product onigiri = new Product("おにぎり", 180);
		MyInspectorTCP_IP.inspect(onigiri, "127.0.0.1");
	}

	@Override
	public void debugPrint(PrintWriter writer) {
		writer.println("Productのインスタンス：の値　" + name + ", " + price);
	}
}
