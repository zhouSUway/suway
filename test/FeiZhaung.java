package test;

class Student {
	private String name;

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age <= 0) {
			System.out.println("�Բ�������������䲻�Ϸ�......");
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
		System.out.println("��Һã��ҽ�" + name + "�ҽ���" + age + "��");
	}
}

public class FeiZhaung {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɷ������

		Student stu = new Student();
		stu.setAge(-30);
		stu.setName("����");
		stu.introduce();

	}

}
