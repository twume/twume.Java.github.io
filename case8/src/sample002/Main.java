package sample002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
	public static void main(String[] args) {
		Log logger = LogFactory.getLog(Main.class);
		if (args.length != 2) {
			logger.error("起動引数の数が異常：" + args.length);

		}
	}
}

//例として、commons-loggingを使用

//ログ出力ライブラリ
//Log4J
//java.util.logging
//commons-logging
//SLF4J