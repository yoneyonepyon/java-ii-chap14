
public class SyainBMI implements Bmiable {

	@SuppressWarnings("unused")
	private String busyo; // 会社での所属部署
	private int height; // 身長（単位：cm）
	private int weight; // 体重（単位：kg）

	public SyainBMI(String busyo, int height, int weight) {
		this.busyo = busyo;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getHeight() {
		return height;
	}

}
