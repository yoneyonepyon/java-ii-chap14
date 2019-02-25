
public class Engineer implements Bmiable {

	@SuppressWarnings("unused")
	private String syokusyu;// 職種（プログラマ、ネットワークエンジニアなど）
	private double heightM;// 身長（単位：m）cmでなく m です★
	private int weight;// 体重（単位：kg）

	public Engineer(String syokusyu, double heightM, int weight) {
		super();
		this.syokusyu = syokusyu;
		this.heightM = heightM;
		this.weight = weight;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getHeight() {
		return (int) (heightM * 100);
	}

}
