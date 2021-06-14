package sample001;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		//		第二引数が省略またはfalseの場合、データを上書き
		//		それ以外はデータを追記
		FileWriter fw = new FileWriter("e:\\rpgsave.dat", true);
		fw.write('A');
		fw.write("test");
		//		閉じる前にflushを呼び出す（書き込まれていない場合があるので）
		fw.flush();
		fw.close();
	}
}

//FileWriteクラス
//IOExceptionが必要
//テキストファイルで使用

//ランダムアクセス
//java.io.RandomAccessFileクラス
//RndaomAccessFile f = new RandomAccessFile("file.txt","rw");
//20バイト目から１バイト読み込む
//f.seek(20);
//byte b = f.readByte();
//18バイト目に書き込む
//f.seek(18);
//f.writeByte(b);

//java.io.MappedByteBufferクラス
//ファイルの内容をバイト配列としてメモリに読み込みそれに変更を加えて、またファイルに書き戻すことができる