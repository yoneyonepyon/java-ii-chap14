
public class MeisiCard implements AtenaSealPrintable {

	@SuppressWarnings("unused")
	private int kanriNo; // 管理番号
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

	public MeisiCard(int kanriNo, String postal, String address, String companyName, String name) {
		super();
		this.kanriNo = kanriNo;
		this.postal = postal;
		this.address = address;
		this.companyName = companyName;
		this.name = name;
	}

	@Override
	public String getCompanyName() {
		return companyName;
	}

	@Override
	public String getName() {
		return name;
	}

}
