package lesson27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("コンソールに文字を入力してください");
		Scanner sc1 = new Scanner(System.in);
		String date = sc1.next();
		String[] dates = date.split(","); // 動物ごとに分ける
		Animal a = new Animal();
			for(String d :dates) {
				String[] animals = d.split(":"); // 各動物の項目ごとに分ける
				for(int i = 0; i < animals.length; i++) {
					// 動物名の取得
		        	a.setName(animals[i]);
		    		String n = a.getName();
		    		System.out.println("動物名：" + n);
		    		// 体長の取得
		    		double b = Double.parseDouble(animals[++i]);
		    		a.setLength(b);
		    		double l = a.getLength();
		    		System.out.println("体長：" + l + "m");
		    		// 速度の取得
		    		int c = Integer.parseInt(animals[++i]);
		    		a.setSpeed(c);
		    		int s = a.getSpeed();	
		    		System.out.println("速度：" + s + "km/h");
		    		// 学名の取得
		    		if((n == "ライオン" && l == 2.1) || (s == 80)){
		    			System.out.println("学名：パンテラ レオ");
		    			System.out.println("");
		    		}else if((n == "ゾウ" && l == 3.2) || (s == 40)) {
		    			System.out.println("学名：ロキソドンタ・サイクロティス");
		    			System.out.println("");
		    		}else if((n == "パンダ" && l == 1.9) || (s == 30)) {
		    			System.out.println("学名：アイルロポダ・メラノレウカ");
		    			System.out.println("");
		    		}else if((n == "チンパンジー" && l == 0.94) || (s == 25)) {
		    			System.out.println("学名：パン・トゥログロディテス");
		    			System.out.println("");
		    		}else if((n == "シマウマ" && l == 2.4) || (s == 65)) {
		    			System.out.println("学名：チャップマンシマウマ");
		    			System.out.println("");
		    		}else if((n == "インコ" && l == 0.1) || (s == 50)) {
		    			System.out.println("学名：不明");
		    		} // if文
				} // for(int i = 0; i < animals.length; i++)
			} // for(String j :dates) 
	} // public static void main(String[] args)
} // Main class
