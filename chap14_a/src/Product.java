import java.io.PrintWriter;

// ���i�N���X
public class Product implements MultiDebugPrintable {
	String name; // ���i�̖��O
	int price; // ���i�̉��i

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		Product pan = new Product("�p��", 120);
		MyInspectorTCP_IP.inspect(pan, "127.0.0.1");
		Product onigiri = new Product("���ɂ���", 180);
		MyInspectorTCP_IP.inspect(onigiri, "127.0.0.1");
	}

	@Override
	public void debugPrint(PrintWriter writer) {
		writer.println("Product�̃C���X�^���X�F�̒l�@" + name + ", " + price);
	}
}
