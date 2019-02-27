import java.util.Arrays;

public class Person implements Comparable<Person> {
	String name; // 名前
	int weight; // 体重

	public Person(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public static void main(String[] args) {
		Person r[] = new Person[5];

		r[0] = new Person("青木", 60);
		r[1] = new Person("木村", 56);
		r[2] = new Person("佐藤", 70);
		r[3] = new Person("中村", 53);
		r[4] = new Person("伊藤", 65);

		System.out.println("並べ替える前");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i].weight + " ");
		}
		System.out.println("");

		// 以下を自分で作成してください。
		Arrays.sort(r);

		System.out.println("並べ替えた後");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i].weight + " ");
		}
		System.out.println("");

	}

	@Override
	public int compareTo(Person o) {
		return weight - o.weight;
	}
}
