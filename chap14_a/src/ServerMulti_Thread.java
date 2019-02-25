
// Socket 繰り返し＋マルチスレッド 通信プログラム(サーバー)
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMulti_Thread {

	public static void main(String[] args) {
		try {
			System.out.println("===== サーバ起動しました ===== ");
			// サーバの使用する ポート番号9000を指定して
			// ServerSocketインスタンスを作成する。
			@SuppressWarnings("resource")
			ServerSocket serverSoc = new ServerSocket(9000);

			while (true) {
				// クライアントからの接続を待機するaccept()メソッド。
				// accept()は、接続があるまで処理はブロックされる。
				// 複数のクライアントからの接続を受け付けるようにするには
				// スレッドを使う。★
				// accept()は接続時に新たなsocketを返す。これを使って通信を行なう。
				System.out.println("===== 接続を待っています ===== ");
				Socket socket = serverSoc.accept(); // 接続の受付
				// 接続があれば次の命令に移る。

				// スレッドを起動し、クライアントと通信する。■
				new ServerMulti_Thread_run(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 以下は、「static内部クラス」です。
	public static class ServerMulti_Thread_run extends Thread {
		private Socket socket;

		public ServerMulti_Thread_run(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				System.out.println("送信元IPアドレス：" + socket.getInetAddress());
				// System.out.println(socket.getRemoteSocketAddress());
				// System.out.println(socket.getLocalAddress());
				// System.out.println(socket.getLocalSocketAddress());
				// ソケットインスタンスからInputStreamを取得し
				// BufferedReaderインスタンスを作成する。
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				// ソケットインスタンスからOutputStreamを取得し
				// PrintWriterrインスタンスを作成する。
				PrintWriter writer = new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(socket.getOutputStream())),
						true);
				// PrintWriterの第二引数に trueを設定することで、
				// printlnなどの出力メソッドの直後に
				// flush()メソッドが実行されます。

				// 繰り返し、受信し、そのデータを表示する。
				String message;
				while ((message = reader.readLine()) != null) {
					System.out.println("受信データ：" + message);
				}

				// ソケットストリームをクローズする。
				reader.close();
				writer.close();
				// 一つのクライアント接続をクローズする。
				socket.close();
				System.out.println("終了します。");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
