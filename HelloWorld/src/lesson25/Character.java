package lesson25;

import java.util.Scanner;

public class Character {
	public String name;
	
	public final void naming() {
		Scanner sc1 = new Scanner(System.in);
		this.name = sc1.nextLine();
		if(name.length() > 0) {
			System.out.println("こんにちは 「" + name + "」 さん");
		}else {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
	}
	public void characterMake() {
		int[] status = new int[3]; // 配列の要素を3つ用意
		for(int i = 0; i < status.length; i++) { // 要素の数だけ
			status[i] = new java.util.Random().nextInt(900)+100; // ランダムな数字を作成（接待用）
		}
		System.out.println("ステータス");
		System.out.println("HP：" + status[0]);
		System.out.println("MP：" + status[1]);
		System.out.println("攻撃力：" + status[2]);
	}
}
