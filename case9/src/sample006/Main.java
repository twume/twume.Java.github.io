package sample006;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import javax.crypto.CipherOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		//		通常のファイル出力ストリームを生成
		FileOutputStream fos = new FileOutputStream("data.txt");
		//このストリームを下流に持つ暗号化ストリームcosを生成し接続
		//algoは暗号化方式等の指定が格納されているものとする
		CipherOutputStream cos = new CipherOutputStream(fos, algo);
		//		さらに文字バイト変換をするストリームoswを接続
		OutputStreamWriter osw = new OutputStreamWriter(cos);
		//oswに書き込めば、暗号化されたうえでファイルに流れていく
		osw.write("AB");
		osw.flush();
		osw.close();
	}
}

//フィルタの特徴
//FileReader、FileWriter、FileInputStream、FileOutputStreamのいづれかを継承
//すでに存在するストリームを接続先としてコンストラクタで指定して生成する
//フィルタを複数連結することもできる