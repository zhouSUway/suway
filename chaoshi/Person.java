package chaoshi;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Product shopping(Market market, String string) {
		return market.sell(name);
	}

}
