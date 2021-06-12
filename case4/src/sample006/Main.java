package sample006;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		Sword s = new Sword("はがねの剣");
		h1.setSword(s);
		System.out.println("装備:" + h1.getSword().getName());
		System.out.println("clone()で複製");
		Hero h2 = h1.clone();
		System.out.println("コピー元の勇者の剣の名前を変える");
		h1.getSword().setName("ひのきの棒");
		System.out.println("コピー元とコピー先の勇者の装備");

		//		コピー元の装備名を変更したはずなのに、コピー先の装備の名前まで変更された
		System.out.println("コピー元:" + h1.getSword().getName() + "コピー先:" + h2.getSword().getName());
	}
}

//原因は、clone()メソッドで、Swordにセットされるのは参照だから。これを浅いコピーという
//対策としては、SwordクラスでCloneableインターフェースを実装して、
//Heroクラスの、clone()メソッド内のSwordの設定の部分を
//resulet.sword = this.sword.clone();という風にすればよい（深いコピー）