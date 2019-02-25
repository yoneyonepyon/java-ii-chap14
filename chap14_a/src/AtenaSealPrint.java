
public class AtenaSealPrint {

	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		SyainAtena syainAtena = new SyainAtena(// 社員クラス
				"063-0804", // 郵便番号
				"北海道札幌市西区二十四軒４条１丁目４番１号", // 住所
				"独立行政法人高齢・障害・求職者雇用支援機構　北海道支部", // 会社名
				"山田　太郎", // 氏名
				35);// 年齢
		AtenaSealPrint.printAtena(syainAtena);

		System.out.println("---------------------------------------");
		MeisiCard meisiCard = new MeisiCard(// 名刺カードクラス
				100, // 管理番号
				"060-0002", // 郵便番号
				"北海道札幌市中央区北２条西３丁目１番１２号 敷島ビル", // 住所
				"㈱札幌ソフトウェアソルーションズ", // 会社名
				"木村 あきお");// 氏名
		AtenaSealPrint.printAtena(meisiCard);

		System.out.println("---------------------------------------");
		// 引数に配列を指定
		AtenaSealPrint.printAtena(new AtenaSealPrintable[] { syainAtena, meisiCard });
		System.out.println("---------------------------------------");
	}

	private static void printAtena(AtenaSealPrintable[] atenas) {
		for (AtenaSealPrintable atena : atenas) {
			printAtena(atena);
			System.out.println();
		}
	}

	private static void printAtena(AtenaSealPrintable atena) {
		System.out.println("");
		AtenaSealUtil.println(atena.getPostal());
		AtenaSealUtil.println(atena.getAddress());
		System.out.println("");
		AtenaSealUtil.println(atena.getCompanyName());
		System.out.println("");
		AtenaSealUtil.println(atena.getName() + "様");
		System.out.println("");
	}

}
