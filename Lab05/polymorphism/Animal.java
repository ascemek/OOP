package polymorphism;

/** 
 * @author fahmida hamid
 * @version 1.0
 */

/*
 * Animal is a super class.
 */
public class Animal { 

	private String name;
	
	public Animal(String name) {
	     	this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " is an Animal.";
	}

	public void canWalk() {
		System.out.println(name + " can walk.");
	}
	public void canEat() {
		System.out.println(name + " loves to eat.");
	}
}
