package sample003;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("e:\\rpgsave.dat", true);
		//		２進数の01000001は、「65」→これをバイナリで書き込むと「A」になる
		fos.write(65);
		fos.flush();
		fos.close();
	}
}

//FileOutputStreamクラス
//FileInputStreamクラス
//IOExceptionが必要
//バイナリファイルで使用する

//FileWriterは引数で与えられた文字をバイト表現に変換してファイルに書き込む
//FileReaderはファイルから読んだバイト表現を文字情報に変換して返す
//両方とも、システム標準の文字コード体系が利用されるが、コンストラクタで指定することも可
//文字列をバイト列に変換するStringクラスのgetBytes()メソッドを使う場合も文字コードの指定が可能