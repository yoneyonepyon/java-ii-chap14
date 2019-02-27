import java.util.Arrays;

public class EMCard implements Comparable<EMCard> {
	String name; // 名前
	int zandaka; // カード残高

	public EMCard(String name, int zandaka) {
		this.name = name;
		this.zandaka = zandaka;
	}

	public static void main(String[] args) {
		EMCard[] emCards = {
				new EMCard("青木カード", 6000),
				new EMCard("木村カード", 3000),
				new EMCard("佐藤カード", 1000),
				new EMCard("中村カード", 2000),
				new EMCard("伊藤カード", 5000) };

		System.out.println("並べ替える前");
		for (int i = 0; i < emCards.length; i++) {
			System.out.print(emCards[i].zandaka + " ");
		}
		System.out.println("");

		// 以下を自分で作成してください。
		Arrays.sort(emCards);

		System.out.println("並べ替えた後");
		for (int i = 0; i < emCards.length; i++) {
			System.out.print(emCards[i].zandaka + " ");
		}
		System.out.println("");

	}

	@Override
	public int compareTo(EMCard o) {
		return o.zandaka - zandaka;
	}
}