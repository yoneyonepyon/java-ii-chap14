
public class SyainTikatetu implements EkiID_Getable {

	@SuppressWarnings("unused")
	private String busyo; // 会社での所属部署
	private int ekiID; // 「通勤で乗る駅の番号」【 1 (「円山公園」)、2 (「大通」) 】

	@Override
	public int getEkiID() {
		return ekiID;
	}

	public SyainTikatetu(String busyo, int ekiID) {
		super();
		this.busyo = busyo;
		this.ekiID = ekiID;
	}

}
