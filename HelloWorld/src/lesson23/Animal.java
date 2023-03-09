package lesson23;

import java.util.Objects;

public class Animal {
	private String name; // 動物名フィールドの宣言
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(Objects.nonNull(name) && name.length()>0) { // 名前がnull出なければ
			this.name = name; // 代入しても大丈夫
		}else {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
	}
	
	private double length; // 体長フィールドの宣言
	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
			this.length = length; 
	}
	
	private int speed; // 速度フィールドの宣言
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
			this.speed = speed; 
	}
}
