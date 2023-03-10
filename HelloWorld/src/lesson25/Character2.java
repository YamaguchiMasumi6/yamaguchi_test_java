package lesson25;

public class Character2 extends Character{
	public void characterMake() {
		int[] status = new int[2]; // 配列の要素を5つ用意
		for(int i = 0; i < status.length; i++) { // 要素の
			status[i] = new java.util.Random().nextInt(900)+100; // ランダムな数字を作成（接待用）
		}
		System.out.println("素早さ：" + status[0]);
		System.out.println("防御力：" + status[1]);
	}
}
