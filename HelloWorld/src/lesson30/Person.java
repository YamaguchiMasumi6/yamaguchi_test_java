package lesson30;



public class Person {
	String name;
	int age;
	double height;
	double weight;
	
	
	Person(String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;
	}
	
	public void print() {
		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age);
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
		System.out.println("");
	}
	
	
} // public class Person 
