/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
				*/
package sample;

public class practice2 {

	public static void main(String[] args) {
	for(int i = 1; i < 10; i++) {  // かけられる数を１から９まで繰り返し
		for(int j = 1; j < 10; j++) { // かける数も１から９まで繰り返し
			System.out.print(i * j); // 掛け算の結果を出力
			System.out.print(" "); // 空白を出力
		}
		System.out.println("");
	}
	}
}
