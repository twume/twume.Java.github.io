package sample001;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Bank {
	String name;
	String address;

	//	通常の書き方
	//	public boolean equals(Object obj) {
	//		if(obj==this){
	//			return true;
	//		}
	//		if(obj==null) {
	//			return false;
	//		}
	//		if(!(obj instanceof Bank)){
	//			return false;
	//		}
	//		Bank b = (Bank)obj;
	//		if (!b.name.equals(this.name)){
	//			return false;
	//		}
	//		if(!b.address.equals(this.address)) {
	//			return false;
	//		}
	//		return true;
	//	}

	//	ライブラリを使用
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	//	HashCodeに関してもライブラリを使用
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}

//Apache Commons プロジェクト
//commons-lang	Java言語の基本機能を強化する
//commons-logging ログ出力を行う
//commons-collections	コレクションをより便利に使う