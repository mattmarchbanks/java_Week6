package week6Assignment;

// Question 1
public class Card {

	// Fields
	private int value;
	private String name;
	
	
	//Methods
	public Card(String name, int value) {
		this.setName(name);
		this.setValue(value);
	}
	
	public void setValue(int value) {
			this.value = value;	
	}
	
	public int getValue() {
		return value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void describe() {
		System.out.println("Name: " + name + ". Value: " + value);
	}
	
}	