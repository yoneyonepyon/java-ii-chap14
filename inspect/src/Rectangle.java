
public class Rectangle implements DebugPrintable {
	int width;
	int height;

	public Rectangle() {
		setSize(10, 20);
	}

	public Rectangle(int width, int height) {
		setSize(width, height);
	}

	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(123, 45);
		MyInspector.inspect(r); // ここで、MyInspectorクラスのinspectメソッドを呼び出してください。
	}

	@Override
	public void debugPrint() {
		System.out.println("Rectangleのインスタンス：の値　" + width + ", " + height);
	}
}
