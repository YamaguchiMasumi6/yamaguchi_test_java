/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package lesson23;

public class Theme2 {
	public static void main(String[] args) {
		Animal n = new Animal();
		n.setName("ライオン");
		String a = n.getName();
		System.out.println("動物名：" + a);

		n.setLength(2.1);
		double b = n.getLength();
		System.out.println("体長：" + b + "m");

		n.setSpeed(80);
		int c = n.getSpeed();
		System.out.println("速度：" + c + "km/h");
	}
	
}

