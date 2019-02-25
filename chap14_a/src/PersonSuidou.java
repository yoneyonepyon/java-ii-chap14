
public class PersonSuidou implements SuidouMeasurable {

	@SuppressWarnings("unused")
	private String name;// 名前
	private int siyouRyou;// 水道使用量（単位：立方m）

	@Override
	public int getSiyouRyou() {
		return siyouRyou;
	}

	public PersonSuidou(String name, int siyouRyou) {
		super();
		this.name = name;
		this.siyouRyou = siyouRyou;
	}

}
