
public class PersonKetuatu implements KetuatuMeasurable {

	@SuppressWarnings("unused")
	private String name;// 名前
	private int ueKetuatu;// 上の血圧（収縮期血圧）（単位：mmHg）
	private int sitaKetuatu;// 下の血圧（拡張期血圧）（単位：mmHg）

	@Override
	public int getUeKetuatu() {
		return ueKetuatu;
	}

	@Override
	public int getSitaKetuatu() {
		return sitaKetuatu;
	}

	public PersonKetuatu(String name, int ueKetuatu, int sitaKetuatu) {
		this.name = name;
		this.ueKetuatu = ueKetuatu;
		this.sitaKetuatu = sitaKetuatu;
	}

}
