@SuppressWarnings("unused")
public class Patient implements KetuatuMeasurable {

	private String name;// 名前
	private String clinicalDepartments;// 診療科（Clinical Departments）
	private int ueKetuatu;// 上の血圧（収縮期血圧）（単位：mmHg）
	private int sitaKetuatu;// 下の血圧（拡張期血圧）（単位：mmHg）

	public static void main(String[] args) {
		Patient patient = new Patient("田中", "循環器内科", 150, 80);
		int hantei = Ketuatu.kouketuatu(patient);
		System.out.println(hantei);
	}

	@Override
	public int getUeKetuatu() {
		return ueKetuatu;
	}

	@Override
	public int getSitaKetuatu() {
		return sitaKetuatu;
	}

	public Patient(String name, String clinicalDepartments, int ueKetuatu, int sitaKetuatu) {
		this.name = name;
		this.clinicalDepartments = clinicalDepartments;
		this.ueKetuatu = ueKetuatu;
		this.sitaKetuatu = sitaKetuatu;
	}

}
