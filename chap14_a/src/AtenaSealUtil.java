
public class AtenaSealUtil {

	public static void println(String line) {
		System.out.print("　　");
		for (int i = 0; i < line.length(); i++) {
			if (i > 0 && i % 16 == 0) {
				System.out.print("\n　　");
			}
			char c = line.charAt(i);
			System.out.print(c);
		}
		System.out.println("");
	}

}
