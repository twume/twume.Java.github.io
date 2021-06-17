package sample002;

import java.io.IOException;
import java.net.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		//接続先と、ポートを指定
		try {
			Socket sock = new Socket("dokojava.jp", 80);
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			//サーバに対して取得要求
			os.write("GET /index.html HTTP/1.0\r\n".getBytes());
			os.write("\r\n".getBytes());
			os.flush();
			InputStreamReader isr = new InputStreamReader(is);
			int i = isr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = isr.read();
			}
			sock.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}

	}
}

//TCP/IPを使って接続を行うには、java.net.Socketクラスを使用する
//UDPを使用する場合は、java.net.DatagramSocketクラスを使用する

//commons-netライブライを使用するとよい