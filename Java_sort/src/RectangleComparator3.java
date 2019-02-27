import java.util.Comparator;

public class RectangleComparator3 implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		return o2.width - o1.width;
	}

}
