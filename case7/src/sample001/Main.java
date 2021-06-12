package sample001;

public class Main {
	public static void main(String[] args) {
		if (true) {
			System.out.println("データが壊れています。異常終了します。");
			System.exit(1);
		}
		System.out.println("正常終了しました。");
	}
}

//exit()の引数
//「０」は正常終了
//「０」以外は異常終了
