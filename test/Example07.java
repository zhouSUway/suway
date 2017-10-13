package test;

class Person {
	String name;

	int age;

	public Person(String con_name, int con_age) {
		super();
		// TODO 自动生成构造函数存根
		this.name = con_name;
		this.age = con_age;
	}

	public Person(String con_name) {
		this.name = con_name;
	}

	public void speak() {
		System.out.println("大家好，我叫" + name + "我今年" + age + "岁");
	}
}

public class Example07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成方法存根
		Person p1 = new Person("韩琴");
		Person p2 = new Person("小樱", 27);
		p1.speak();
		p2.speak();
	}

}
