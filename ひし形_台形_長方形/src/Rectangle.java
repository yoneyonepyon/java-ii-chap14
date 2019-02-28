
public class Rectangle implements GetArea {
	int width;
	int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
	}

	@Override
	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(200, 30);
		System.out.println("長方形の面積は " + r.getArea());
	}
}
/*
 * 長方形の面積は 6000
 */