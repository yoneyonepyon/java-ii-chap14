import java.io.PrintWriter;

public class Rectangle implements MultiDebugPrintable {
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
		MyInspectorTCP_IP.inspect(r, "127.0.0.1");
	}

	@Override
	public void debugPrint(PrintWriter writer) {
		writer.println("Rectangleのインスタンス：の値　" + width + ", " + height);
	}
}
