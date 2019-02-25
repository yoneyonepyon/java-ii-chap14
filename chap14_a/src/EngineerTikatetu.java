
public class EngineerTikatetu implements EkiID_Getable {

	@SuppressWarnings("unused")
	private String syokusyu; // 職種（プログラマ、ネットワークエンジニアなど）
	private int ekiID; // 「通勤で乗る駅の番号」【 1 (「円山公園」)、2 (「大通」) 】

	@Override
	public int getEkiID() {
		return ekiID;
	}

	public EngineerTikatetu(String syokusyu, int ekiID) {
		this.syokusyu = syokusyu;
		this.ekiID = ekiID;
	}

}
