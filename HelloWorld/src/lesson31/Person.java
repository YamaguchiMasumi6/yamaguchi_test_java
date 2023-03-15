package lesson31;



public class Person {
	String familyName;
	String name;
	int age;
	double height;
	double weight;
	String fullName;
	
	Person(String familyName,String name,int age,double height,double weight){
		this.familyName = familyName;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String fullName() {
		this.fullName = familyName + name;
		return fullName;
	}
	
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
	
//	public double bmi() {
//		double bmi = this.weight / (this.height * this.height);
//		return bmi;
//	}
//	
//	public void print() {
//		System.out.println("名前は" + name + "です");
//		System.out.println("年は" + age);
//		System.out.println("BMIは" + Math.floor(bmi()) + "です");
//		System.out.println("");
//	}
	
	
} // public class Person 
