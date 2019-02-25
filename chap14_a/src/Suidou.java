
public class Suidou {

	public static int getSuidouRyoukin(SuidouMeasurable suidouMeasurable) {
		if (suidouMeasurable.getSiyouRyou() > 500) {
			return 350;
		}
		return 330;
	}

	public static void main(String[] args) {
		HomeSuidou home = new HomeSuidou("高橋", "中央区", 700);
		int suidouRyoukin = Suidou.getSuidouRyoukin(home);
		System.out.println(suidouRyoukin);
		System.out.println("---------------------------");
		PersonSuidou person = new PersonSuidou("田中", 160);
		suidouRyoukin = Suidou.getSuidouRyoukin(person);
		System.out.println(suidouRyoukin);
	}

}
