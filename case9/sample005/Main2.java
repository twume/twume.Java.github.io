package sample005;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			baos.write(65);
			baos.write(66);
			byte[] data = baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//ByteArrayOutputStreamクラス
//バイト配列に対して１バイトずつ順次書き込んでいく
//書き込みが完了したところでtoByteArray()メソッドを呼び出せばバイト配列が得られる