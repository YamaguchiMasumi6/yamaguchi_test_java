package lesson29;

import java.util.Arrays;

import lesson28.Processing;

public class Execution {

	public static void main(String[] args) {

		String strInput = new java.util.Scanner(System.in).nextLine();
		
		String[] strSplit = strInput.split("\\."); // 空白ごとに分割
		Arrays.sort(strSplit); // 並べ替え
		int[] num = new int[strSplit.length]; // 分割数分の整数の配列を生成
		
		for (int i = 0; i < strSplit.length; i++) {
			num[i] = Integer.parseInt(strSplit[i]);
			Processing p = new Processing();
			String[] date = p.prefectures[num[i]].split(":"); // 項目ごとに分ける
			for(int a = 0; a < date.length; a++) {
				// 都道府県名の出力
				String pre = date[a];
				System.out.println("都道府県名：" + pre);
				// 県庁所在地の出力
				String city = date[++a];
				System.out.println("県庁所在地：" + city);
				// 面積の出力
				String area = date[++a];
				System.out.println("面積：" + area);
				System.out.println("");
			}
		}
	}

}
