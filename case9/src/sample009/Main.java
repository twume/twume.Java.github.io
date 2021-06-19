package sample009;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		//		String f1 = args[0];
		//		String f2 = args[1];
		FileInputStream fi = new FileInputStream(f1);
		FileOutputStream fo = new FileOutputStream(f2);
		int i = fi.read();
		while (i != -1) {
			fo.write(i);
			i = fi.read();
		}
		fo.flush();
		fi.close();
		fo.close();
	}
}
