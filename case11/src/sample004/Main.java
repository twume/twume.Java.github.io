package sample004;

import java.net.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://dokojava.jp/favicon.ico");
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("e:\\dj.ico");
			int i = is.read();
			if (i != -1) {
				os.write(i);
				i = is.read();
			}
			os.flush();
			os.close();
			is.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
