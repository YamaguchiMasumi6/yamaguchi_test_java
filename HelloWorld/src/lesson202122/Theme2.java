/*
 
	下記がコンソールに出力されるように作成してください
	
	寿司はうまい
	寿司は和食です

  */
package lesson202122;

import java.util.Objects;

public class Theme2 {
	public static void main(String[] args) {
		String sushi = "寿司はうまい";
		String category = "寿司は和食です";
		if(Objects.nonNull(sushi) && category.length() > 0) {
			System.out.println(sushi);
			System.out.println(category);
		}
	}
}