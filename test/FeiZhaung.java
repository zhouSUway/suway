package test;

class Student {
	private String name;

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age <= 0) {
			System.out.println("对不起，您输入的年龄不合法......");
		} else {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void introduce() {
		System.out.println("大家好，我叫" + name + "我今年" + age + "岁");
	}
}

public class FeiZhaung {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO 自动生成方法存根

		Student stu = new Student();
		stu.setAge(-30);
		stu.setName("韩庆");
		stu.introduce();

	}

}
