package sample003;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("e:\\rpgsave.xml");
		//DoucmentBuilderFactory.newInstance()で、DocumentBuilderFactoryインスタンス生成
		//newDocumentBuilder()で、DocumentBuilderインスタンス生成
		//parse(InputStream i)で、Documentインスタンスを取得
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
		//		heroタグを取得
		Element hero = doc.getDocumentElement();
		//		heroタグのweaponタグを取得
		Element weapon = findChildByTag(hero, "weapon");
		//		weaponタグのpowerタグを取得
		Element power = findChildByTag(weapon, "power");
		//		powerタグの中の文字列を取得
		String value = power.getTextContent();
		System.out.println(value);
	}

	static Element findChildByTag(Element self, String name) throws Exception {
		//		渡されたElementのすべての子を取得
		NodeList children = self.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i) instanceof Element) {
				Element e = (Element) children.item(i);
				if (e.getTagName().equals(name)) {
					return e;
				}
			}
		}
		return null;
	}
}

//XML形式
//JAXP:XML形式のファイルを操作するためのAPI
//javax.xml.parsersパッケージ
//org.w3c.domパッケージ