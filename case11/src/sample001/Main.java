package sample001;

import java.net.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		try {
			URL url = new URL("https://dokojava.jp");
			InputStream is = url.openStream();
			isr = new InputStreamReader(is);
			int i = isr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = isr.read();
			}
			isr.close();
		} catch (MalformedURLException e) {
			//			不正な形式のURLが見つかった場合
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		} finally {
			try {
				if (isr != null) {
					isr.close();
				}
			} catch (IOException e3) {

			}
		}

	}
}

//ネットワーク通信
//高水準API:java.net.URLクラス