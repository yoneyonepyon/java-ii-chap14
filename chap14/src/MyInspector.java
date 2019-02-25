import java.io.FileNotFoundException;

public class MyInspector {

	static void inspect(DebugPrintable dp) {
		dp.debugPrint();
	}

	public static void main(String[] args) throws FileNotFoundException {
		DebugPrintable obj1 = new MyNumber(123);
		MyInspector.inspect(obj1);
		MyInspector.inspect(new MyFileReader("input.txt"));
	}

}
