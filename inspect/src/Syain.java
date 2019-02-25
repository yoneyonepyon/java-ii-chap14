// 社員クラス
public class Syain implements DebugPrintable {
	String name; // 社員の名前
	int age; // 社員の年齢

	public Syain(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String args[]) {
		Syain yamada = new Syain("山田", 25);
		MyInspector.inspect(yamada); // ここで、MyInspectorクラスのinspectメソッドを呼び出してください。
		Syain kimura = new Syain("木村", 30);
		MyInspector.inspect(kimura); // ここで、MyInspectorクラスのinspectメソッドを呼び出してください。
	}

	@Override
	public void debugPrint() {
		System.out.println("Syainのインスタンス：の値　" + name + ", " + age);
	}
}
