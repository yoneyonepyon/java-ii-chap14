@SuppressWarnings("unused")
public class HomeSuidou implements SuidouMeasurable {

	private String name;// 住宅名
	private String address;// 住所（中央区など）
	private int siyouRyou;// 水道使用量（単位：立方m）

	public HomeSuidou(String name, String address, int siyouRyou) {
		super();
		this.name = name;
		this.address = address;
		this.siyouRyou = siyouRyou;
	}

	@Override
	public int getSiyouRyou() {
		return siyouRyou;
	}

}
