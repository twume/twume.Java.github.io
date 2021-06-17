package sample005;

import java.util.Properties;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Reader fr = new FileReader("e:\\pref.properties");
		Properties pro = new Properties();
		pro.load(fr);
		String capital = pro.getProperty("aichi.capital");
		String food = pro.getProperty("aichi.food");
		System.out.println(capital + ":" + food);
		fr.close();

		Employee emp = new Employee("田中太郎", 41);
		Department dp = new Department("総務部", emp);
		OutputStream fos = new FileOutputStream("e:\\company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dp);
		oos.flush();
		oos.close();

		Department dp2 = new Department();
		InputStream is = new FileInputStream("e:\\company.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		dp2 = (Department) ois.readObject();
		System.out.println(dp);
		System.out.println(dp2);
		is.close();
		ois.close();
	}
}
