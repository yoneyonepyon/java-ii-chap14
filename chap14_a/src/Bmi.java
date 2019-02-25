
public class Bmi {

	public static void main(String[] args) {
		SyainBMI syain = new SyainBMI("営業部", 160, 52);
		double bmi = Bmi.getBmi(syain);
		System.out.println(bmi);
		System.out.println("---------------------------");
		Person person = new Person("田中", 170, 80);
		bmi = Bmi.getBmi(person);
		System.out.println(bmi);
		System.out.println("---------------------------");
		Engineer engineer = new Engineer("プログラマ", 1.7, 80);
		bmi = Bmi.getBmi(engineer);
		System.out.println(bmi);
		System.out.println("---------------------------");
		Employee employee = new Employee("カリフォルニア", 5, 10, 180);
		bmi = Bmi.getBmi(employee);
		System.out.println(bmi);
	}

	private static double getBmi(Bmiable syain) {
		double height = syain.getHeight() * 0.01;
		return syain.getWeight() / (height * height);
	}

}
