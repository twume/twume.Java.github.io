package sample002;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("計算処理をします");
		//		何らかの計算処理
		System.out.println("計算処理終了。結果をメモ帳で表示します。");
		ProcessBuilder pb = new ProcessBuilder(
				"\"C:\\Windows\\System32\\notepad.exe\"",
				"calcreport.txt");

		pb.start();
	}
}

//pb.sttrt()の戻り値はProcessインスタンス
//このインスタンスを使用すれば起動したプログラムの終了をまったり、その終了コードを得られる