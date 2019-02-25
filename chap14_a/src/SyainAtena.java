// 社員クラス
public class SyainAtena implements AtenaSealPrintable {

	@SuppressWarnings("unused")
	private int age; // 年齢
	private String postal; // 郵便番号
	private String address; // 住所
	private String companyName; // 会社名
	private String name; // 氏名

	@Override
	public String getPostal() {
		return postal;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getCompanyName() {
		return companyName;
	}

	@Override
	public String getName() {
		return name;
	}

	public SyainAtena(String postal, String address, String companyName, String name, int age) {
		this.postal = postal;
		this.address = address;
		this.companyName = companyName;
		this.name = name;
		this.age = age;
	}

}
