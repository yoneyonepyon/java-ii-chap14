import java.util.Arrays;

public class Kamoku implements Comparable<Kamoku> {
	String namae; // 科目名
	int tensuu; // 点数

	// コンストラクタ
	public Kamoku(String namae, int tensuu) {
		this.namae = namae;
		this.tensuu = tensuu;
	}

	public static void main(String[] args) {
		Kamoku[] kamokus = {
				new Kamoku("国語", 63), new Kamoku("数学", 50),
				new Kamoku("理科", 30), new Kamoku("社会", 90),
				new Kamoku("英語", 20) };

		System.out.println("並べ替える前");
		for (int i = 0; i < kamokus.length; i++) {
			System.out.print(kamokus[i].tensuu + " ");
		}
		System.out.println("");
		// 以下を自分で作成してください。

		Arrays.sort(kamokus);

		System.out.println("並べ替えた後");
		for (int i = 0; i < kamokus.length; i++) {
			System.out.print(kamokus[i].tensuu + " ");
		}
		System.out.println("");

	}

	@Override
	public int compareTo(Kamoku o) {
		return tensuu - o.tensuu;
	}
}
