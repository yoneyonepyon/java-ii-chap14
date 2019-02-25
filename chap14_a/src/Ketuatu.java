
public class Ketuatu {

	public static int kouketuatu(KetuatuMeasurable syain) {
		if (syain.getUeKetuatu() >= 140 || syain.getSitaKetuatu() >= 90) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		SyainKetuatu syain = new SyainKetuatu("営業部", 140, 88);
		int hantei = Ketuatu.kouketuatu(syain);
		System.out.println(hantei);
		System.out.println("---------------------------");
		PersonKetuatu person = new PersonKetuatu("田中", 139, 80);
		hantei = Ketuatu.kouketuatu(person);
		System.out.println(hantei);
	}

}
