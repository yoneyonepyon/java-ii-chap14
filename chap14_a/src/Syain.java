import java.io.PrintWriter;

// 社員クラス
public class Syain implements MultiDebugPrintable {

	String name; // 社員の名前
	int age; // 社員の年齢

	public Syain(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String args[]) {
		Syain yamada = new Syain("山田", 25);
		MyInspectorTCP_IP.inspect(yamada, "127.0.0.1");
		Syain kimura = new Syain("木村", 30);
		MyInspectorTCP_IP.inspect(kimura, "127.0.0.1");
	}

	@Override
	public void debugPrint(PrintWriter writer) {
		writer.println("Syainのインスタンス：の値　" + name + ", " + age);
	}
}
