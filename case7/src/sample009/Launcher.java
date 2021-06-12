package sample009;

import java.lang.reflect.Method;

public class Launcher {
	public static void main(String[] args) {
		String fqcn = args[0];
		String mt = args[1];

		//		メモリ表示
		showMemory();

		//
		try {
			Class<?> clazz = Class.forName(fqcn);
			showMethod(clazz);
			if (mt.equals("E")) {
				launchExter(clazz);
			} else if (mt.equals("I")) {
				launchInter(clazz);
			} else {
				throw new IllegalArgumentException("起動方法が不正です");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}

		showMemory();
		System.exit(0);

	}

	public static void launchExter(Class<?> clazz) throws Exception {
		ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
		Process p = pb.start();
		p.waitFor();
	}

	public static void launchInter(Class<?> clazz) throws Exception {
		//		メインメソッドを定義（メソッド名、引数の型）
		Method m = clazz.getMethod("main", String[].class);
		//		メインメソッドの引数の値（今回は引数なしなので要素ゼロを定義
		String[] args = {};
		//		静的メソッドを実行する場合は、第一引数はnull。
		//		また、Object可変長引数に配列を渡す場合はObject型へのキャストが必要
		m.invoke(null, (Object) args);
	}

	public static void showMemory() {
		long free = Runtime.getRuntime().freeMemory();
		long total = Runtime.getRuntime().totalMemory();
		long useMemory = (total - free) / 1024 / 1024;
		System.out.println("現在のメモリ使用量：" + useMemory + "MB");
	}

	public static void showMethod(Class<?> clazz) {
		System.out.println("メソッドの一覧を表示");
		Method[] mlist = clazz.getDeclaredMethods();
		for (Method m : mlist) {
			System.out.println(m.getName());
		}
	}
}
