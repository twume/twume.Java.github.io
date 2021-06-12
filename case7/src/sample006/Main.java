package sample006;

public class Main {
	public static void main(String[] args) {
		long a = Runtime.getRuntime().freeMemory();
		System.out.println(a);
		//		バイトをメガバイトで表現
		long b = Runtime.getRuntime().freeMemory() / 1024 / 1024;
		System.out.println(b);
	}
}

//メモリの状態を取得
//Runtime.getRuntime()メソッドでjava.lang.Runtime院スタンを取得
//Runtimeインスタンスで以下の方法でメモリを取得（単位はバイト）
//①public long freeMemory()		残りのメモリ容量
//②public long totalMemory()	現在のメモリの総容量
//③public long maxMemory()		メモリの総容量の限界地

//totalMemoryは、OSから割り当てられた範囲での残り容量（不足すればOSから追加される）
//maxMemoryは、OSが割り当てられる最大値（限度値）
