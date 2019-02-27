import java.util.Arrays;

class Syain implements Comparable<Syain> {
	int id; // 社員のコード
	String name; // 社員の名前
	int age; // 社員の年齢
	int sal; // 社員の給与

	public Syain(int id, String name, int age, int sal) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	public static void main(String[] args) {
		Syain[] syains;
		syains = new Syain[5];
		syains[0] = new Syain(1, "木村", 20, 15);
		syains[1] = new Syain(1, "中村", 26, 22);
		syains[2] = new Syain(1, "山田", 30, 30);
		syains[3] = new Syain(1, "青木", 25, 21);
		syains[4] = new Syain(1, "伊藤", 22, 18);

		System.out.println("並べ替える前");

		for (int i = 0; i < syains.length; i++) {
			System.out.print(syains[i].age + " ");
		}
		System.out.println("");

		// 以下を自分で作成してください。
		Arrays.sort(syains);

		System.out.println("並べ替える前");
		for (int i = 0; i < syains.length; i++) {
			System.out.print(syains[i].age + " ");
		}
		System.out.println("");
	}

	@Override
	public int compareTo(Syain o) {
		return age - o.age;
	}
}
