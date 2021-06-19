package sample009;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main2 {
	public static void main(String[] args) {
		String f1 = args[0];
		String f2 = args[1];

		FileInputStream fis = null;
		GZIPOutputStream zip = null;

		try {
			fis = new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(f2);
			zip = new GZIPOutputStream(new BufferedOutputStream(fos));

			int i = fis.read();
			while (i != -1) {
				zip.write(i);
				i = fis.read();
			}
			zip.flush();
			fis.close();
			zip.close();
		} catch (IOException e) {
			e.printStackTrace();
			try {
				if (fis != null) {
					fis.close();
				}
				if (zip != null) {
					zip.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
