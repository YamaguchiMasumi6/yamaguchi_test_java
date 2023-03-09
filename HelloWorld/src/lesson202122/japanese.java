package lesson202122; // 処理用パッケージ

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class japanese {
	String hello;
	String country;
	String food;
	String taste;
	String category;
	
	public void greeting() { // こんにちは！ここは日本です！
		this.hello = "こんにちは!";
		this.country = "日本";
		if(hello.length()>0 && country.length()>0) { // 変数helloとcountryがnullでなけれ
			System.out.println(hello + "ここは" + country + "です！");
		}else {
			throw new IllegalArgumentException("挨拶または国名がnullです。処理中断");
		}
	}
	
	public void appraise(){ // この寿司はうまい
		this.food = "寿司";
		this.taste = "うまい";
		if(food.length()>0 && taste.length()>0) { // 変数foodとtasteがnullでなけれ
			System.out.println("この" + food + "は" + taste);
		}else {
			throw new IllegalArgumentException("食品名または味の評価がnullです。処理中断");
		}
		
	}
	public void categorize() { // 寿司は和食です
		this.category = "和食";
		if(food.length()>0 && category.length()>0) { // 変数foodとcategoryがnullでなけれ
			System.out.println(food + "は" + category + "です");
		}else {
			throw new IllegalArgumentException("食品名または食のカテゴリーがnullです。処理中断");
		}
	}
	public void create() { // 今の現在日時は2023/03/09 10:23:39です
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		String formatNowDate = dtf.format(nowDate);
		System.out.println("今の現在日時は" + formatNowDate + "です");
	}
	
}
