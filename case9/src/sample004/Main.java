package sample004;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		//tryブロックの外で宣言しnullで初期化しないとfinallyブロックでclose()を呼べない
		FileWriter fw = null;
		try {
			fw = new FileWriter("e:\\rpgsave.dat", true);
			fw.write('A');
			fw.flush();
		} catch (IOException e) {
			System.out.println("ファイル書き込みエラーです");
		} finally {
			if (fw != null) {
				//close()がIOExceptionを送出する可能性があるので再度try-catchが必要
				//ただし失敗しても何もできないのでcatchブロックは空のまま
				try {
					fw.close();
				} catch (IOException e2) {

				}
			}
		}
	}
}

//try(FileWriter fw = new FileWriter("e:\\rpgsave.dat",true)){
//	正常処理
//} catch(IOException e) {
//	以上処理
//}
//この書き方であれば再度try-catchを使用する必要はない