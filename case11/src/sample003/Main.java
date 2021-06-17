package sample003;

import java.io.IOException;
import java.net.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("起動完了。");
		try {
			//待ち受けポートを指定
			ServerSocket svSock = new ServerSocket(39648);
			//			誰かから接続されるまで待ち受ける
			Socket sock = svSock.accept();
			System.out.println(sock.getInetAddress() + "から接続");
			sock.getOutputStream().write("WELCOME".getBytes());
			sock.getOutputStream().flush();
			sock.getOutputStream().close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

//待ち受ける場合は、ServerSocketクラスを使用する