package lesson30;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("鈴木太郎",20,1.7,60);
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		
		Person person2 = new Person("山田花子",22,1.5,50);
		person1.print();
		person2.print();
		
		ArrayList<String> names = new ArrayList<String>();
		names.add(person1.name);
		names.add(person2.name);
		System.out.println("合計は" + names.size() + "人です");
	}

}
