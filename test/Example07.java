package test;

class Person {
	String name;

	int age;

	public Person(String con_name, int con_age) {
		super();
		// TODO �Զ����ɹ��캯�����
		this.name = con_name;
		this.age = con_age;
	}

	public Person(String con_name) {
		this.name = con_name;
	}

	public void speak() {
		System.out.println("��Һã��ҽ�" + name + "�ҽ���" + age + "��");
	}
}

public class Example07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɷ������
		Person p1 = new Person("����");
		Person p2 = new Person("Сӣ", 27);
		p1.speak();
		p2.speak();
	}

}
