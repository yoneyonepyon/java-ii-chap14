public class Person implements Bmiable {

	@SuppressWarnings("unused")
	private String name;// 名前
	private int height;// 身長（単位：cm）
	private int weight;// 体重（単位：kg）

	public Person(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getHeight() {
		return height;
	}

}
