
public class Employee implements Bmiable {

	@SuppressWarnings("unused")
	private String address;// 住所（州名）
	private int heightFoot;// 身長その１（単位 フィート）
	private int heightIncj;// 身長その２（単位 インチ）
	private int weightPound;// 体重（単位：ポンド）

	public Employee(String address, int heightFoot, int heightIncj, int weightPound) {
		super();
		this.address = address;
		this.heightFoot = heightFoot;
		this.heightIncj = heightIncj; // inch
		this.weightPound = weightPound;
	}

	// ( フィート * 30.5 + インチ * 2.54)
	@Override
	public int getHeight() {
		return (int) (heightFoot * 30.5 + heightIncj * 2.54);
	}

	// 体重 180 （ポンド）は、 180 * 0.454 (kg) です。
	@Override
	public int getWeight() {
		return (int) (weightPound * 0.454);
	}

}
