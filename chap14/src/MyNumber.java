
public class MyNumber implements DebugPrintable {

	int a;

	public MyNumber(int a) {
		this.a = a;
	}

	@Override
	public void debugPrint() {
		System.out.println("MyNumberのインスタンスaの値は" + a + "です");
	}

	public static void main(String[] args) {
		MyNumber mn = new MyNumber(1234);
		mn.debugPrint();
	}

}
