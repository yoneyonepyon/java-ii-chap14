
public class Tikatetu {

	public static void main(String[] args) {
		SyainTikatetu syain = new SyainTikatetu("営業部", 1);
		int ryoukin = Tikatetu.getTikatetuRyoukin(syain);
		System.out.println(ryoukin);
		System.out.println("---------------------------");
		EngineerTikatetu engineer = new EngineerTikatetu("プログラマ", 2);
		ryoukin = Tikatetu.getTikatetuRyoukin(engineer);
		System.out.println(ryoukin);
	}

	public static int getTikatetuRyoukin(EkiID_Getable ekiID_Getable) {
		switch (ekiID_Getable.getEkiID()) {
		case 1:
			return 8640;
		case 2:
			return 10370;
		default:
			return 0;
		}
	}

}
