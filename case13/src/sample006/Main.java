package sample006;

public class Main {

}

//javaコマンド
//オプション
//・-cp(-classpath)
//・-jar JARファイル名
//・-verbose:gc		ガベージコレクションが発生するたびに情報が表示される
//・-Xms 最小割当量および-Xmx 最大割当量	JVMに割り当てるヒープ量
//	例）java -Xmx1G -Xms512M

//javaのメモリ領域（OSから割り当てられた）は、ヒープとスタック
//・ヒープ：プログラムが頻繁かつ大量に利用する。不足するとOutOfMemoryErrorが発生

//ヒープ領域が大きいほどガベージコレクションが長時間におよび実行速度の低下につながる

//ガベージコレクションで注意すること
//①いつ実行されるか制御できない
//②GCが動作している間は他の計算処理などは完全に停止する

//メモリリーク
//new演算子を用いてインスタンスを生成しヒープを消費しておきながら、インスタンスの終了後も
//何らかのプログラムミスでヒープが解放されず、どんどんヒープの空き容量が減っていく現象
