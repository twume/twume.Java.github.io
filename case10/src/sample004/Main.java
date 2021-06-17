package sample004;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		Hero hero1 = new Hero("teke", 100, 50);
		//		インスタンスの直列化
		FileOutputStream fos = new FileOutputStream("e:\\rpgsave10.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(hero1);
		oos.flush();
		oos.close();
		//		ファイルからインスタンスを復元
		FileInputStream fis = new FileInputStream("e:\\rpgsave10.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Hero hero2 = (Hero) ois.readObject();
		ois.close();

		System.out.println(hero1);
		System.out.println(hero2);
	}
}
