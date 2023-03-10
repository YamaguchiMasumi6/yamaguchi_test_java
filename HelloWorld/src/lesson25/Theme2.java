/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
 ※数値は毎回変わるように作ってください
 
	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package lesson25;


public class Theme2 {
	
	public static void main(String[] args) {
		Character c = new Character();
		c.naming();
		c.characterMake();
		Character2 c2 = new Character2();
		c2.characterMake();
	}
}
