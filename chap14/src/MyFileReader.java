import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader extends FileReader implements DebugPrintable {

	String filename = null;

	public MyFileReader(String filename) throws FileNotFoundException {
		super(filename);
		this.filename = filename;
	}

	@Override
	public void debugPrint() {
		System.out.println("MyFileReaderのインスタンスのファイル名は: " + filename + "です");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		MyFileReader mr = new MyFileReader("input.txt");
		mr.debugPrint();

		System.out.println("---------------------");

		DebugPrintable obj; // DebugPrintableそのものは初期化できない

		obj = new MyNumber(1234);
		obj.debugPrint();

		obj = new MyFileReader("input.txt");
		obj.debugPrint();

		((MyFileReader) obj).read();

		try {
			obj = new MyNumber(1234);
			((MyFileReader) obj).read();
		} catch (ClassCastException e) {
			System.out.println("MyNumberにはreadがないからClassCastExceptionが発生した");
		}

		System.out.println("---------------------");

		DebugPrintable[] objs = new DebugPrintable[2];
		objs[0] = new MyNumber(1234);
		objs[1] = new MyFileReader("input.txt");

		for (int i = 0; i < objs.length; i++) {
			obj = objs[i];
			obj.debugPrint();
		}
	}

}
