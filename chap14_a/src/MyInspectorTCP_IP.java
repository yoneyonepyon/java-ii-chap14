
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ConnectException;
// 実行する前に、予め、本フォルダーに input.txt を作成しておくこと。
// 空ファイルでOK
import java.net.Socket;
import java.net.UnknownHostException;

class MyInspectorTCP_IP {
	// 本来は、下文のメソッドの throws で実装すべきですが、
	// 処理を簡単化するため、下文の throws をやめ、try-catchで実装します。
	// public void inspect(MultiDebugPrintable obj) throws UnknownHostException,
	// IOException {
	public static void inspect(MultiDebugPrintable obj, String iP_Address) {
		try {
			// サーバのIPアドレスと、サーバの使用している
			// ポート番号を指定してSocketインスタンスを作成する。
			Socket socket = new Socket(iP_Address, 9000);

			// ソケットインスタンスからOutputStreamを取得し
			// PrintWriterrインスタンスを作成する。
			PrintWriter writer = new PrintWriter(
					new BufferedWriter( // テキストP248
							new OutputStreamWriter(socket.getOutputStream())));

			obj.debugPrint(writer);// これに注意★

			writer.flush();
			writer.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (ConnectException e) {
			System.err.println("Eclipseの左画面「パッケージ・エクスプローラ」の\n" +
					"「掲示板表示用Javaプログラム起動.bat」ファイルをＷクリックしてください。\n" +
					"その後「掲示板表示用Javaプログラム」が起動し、コマンドプロンプト画面が表示されるので、\n" +
					"その後、再度、mainメソッドを起動してください。");
			// e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
*/
