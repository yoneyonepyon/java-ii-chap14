import java.io.PrintWriter;

// �Ј��N���X
public class Syain implements MultiDebugPrintable {

	String name; // �Ј��̖��O
	int age; // �Ј��̔N��

	public Syain(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String args[]) {
		Syain yamada = new Syain("�R�c", 25);
		MyInspectorTCP_IP.inspect(yamada, "127.0.0.1");
		Syain kimura = new Syain("�ؑ�", 30);
		MyInspectorTCP_IP.inspect(kimura, "127.0.0.1");
	}

	@Override
	public void debugPrint(PrintWriter writer) {
		writer.println("Syain�̃C���X�^���X�F�̒l�@" + name + ", " + age);
	}
}
