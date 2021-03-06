
public class Test2 {

	public static void printArea(GetArea r) {
		System.out.println("面積：" + r.getArea());
	}

	public static void main(String[] args) {
		System.out.println("-方式1-----");
		GetArea[] rH = new GetArea[4];
		rH[0] = new Rectangle(200, 30);
		rH[1] = new Hisigata(100, 10);
		rH[2] = new Daikei(80, 20, 20);
		rH[3] = new Triangle(100, 40);
		for (int i = 0; i < rH.length; i++) {
			System.out.println("面積：" + rH[i].getArea());
		}

		System.out.println("-方式2-----");
		Rectangle r = new Rectangle(200, 30);
		Hisigata h = new Hisigata(100, 10);
		Daikei d = new Daikei(80, 20, 20);
		Triangle t = new Triangle(100, 40);
		printArea(r);
		printArea(h);
		printArea(d);
		printArea(t);
	}

}
