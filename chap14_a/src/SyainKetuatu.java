
public class SyainKetuatu implements KetuatuMeasurable {

	@SuppressWarnings("unused")
	private String busyo;// 会社での所属部署
	private int ueKetuatu;// 上の血圧（収縮期血圧）（単位：mmHg）
	private int sitaKetuatu;// 下の血圧（拡張期血圧）（単位：mmHg）

	public SyainKetuatu(String busyo, int ueKetuatu, int sitaKetuatu) {
		this.busyo = busyo;
		this.ueKetuatu = ueKetuatu;
		this.sitaKetuatu = sitaKetuatu;
	}

	@Override
	public int getUeKetuatu() {
		return ueKetuatu;
	}

	@Override
	public int getSitaKetuatu() {
		return sitaKetuatu;
	}

}
