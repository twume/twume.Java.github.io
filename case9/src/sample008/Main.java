package sample008;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File("e:\\rpgsave.dat");
		Path p1 = Paths.get("e:\\rpgsave.dat");
		Path p2 = file.toPath();

		Path p3 = Paths.get("e:\\rpgsave2.dat");
		Files.copy(p1, p3);
	}

}

//ファイル自体を操作 java.io.Fileクラス Fileインスタンスは、
//FileInputStreamやFileOutputStreamのコンストラクタの引数として利用可能

//メソッド
//boolean delete()
//boolean renameTo(File dest)
//boolean exists()
//boolean isFile()
//boolean isDirectory()
//long length()
//File[] listFiles()

//Java7から
//java.nio.file.Pathクラス,java.nio.file.Filesクラス
//Pathは従来のFileクラスの後継にあたり、フォルダやファイルを指し示す
//Pathのインスタンスを取得するには、java.nio.file.Pathsクラスのget()メソッドを使用
//すでにFileインスタンスが存在する場合、そのtoPath()メソッドをよぶことでPathインスタンスに変換可能
//Filesインスタンスメソッド
//static long copy(Ptah from, Path to)
//static long move(Path form, Path to)
//static void delete(Path path)
//static byte[] readAllBytes(Path path)
//static List<String> redAllLines(Path path)
//static boolean exists(Path path)
//static boolean isDirectory(Path path)
//static long size(Path path)