/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
package lesson14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String a[] = {"a","b","c","d","e","f","g","h","i","j"};
		for(int i = 0; i < a.length; i++) {
			if(i == 4) {
				break;
			}
			System.out.println(a[i]);
		}
		System.out.println("");
		for(int i = 0; i < a.length; i++) {
			if(i == 8) {
				continue;
			}
			System.out.println(a[i]);
		}
	}

}
