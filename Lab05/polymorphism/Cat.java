package polymorphism;

/** 
 * @author fahmida hamid
 * @version 1.0
 */


//overriding: same name, signature stays the same body of the method changes
//overloading: same name, signature(return type and paramaters) changes the body of the method stays the same.

/*
 * Cat is a subclass of Animal class. 
 * Animal is a superclass.
 */
public class Cat extends Animal{

	private String tail;
	
	public Cat(String name) {
		super(name); // calling the constructor of the super class.
	}
    
	public Cat(String name, String tail) { //overloaded constructor
		super(name);
		this.tail = tail;
	}

	public Cat(Integer id, String tail) { //another overloaded constructor
		super(id.toString());
		this.tail = tail;
	}

	public void canWalk() // Overriding the canWalk() method of it's super/parent class
	{
		super.canWalk(); // calling the method of it's super class
		System.out.println(" ... Really fast, without making any noise!");
	}
	
	// overloading canWalk ...
	public String canWalk(String speedType) {
		return super.getName() + " walks " + speedType + ".";
	}

	// overriding canEat function for Cat class
	public void canEat() {
		System.out.println(getName() + " loves to eat fish.");
	}

	// Overriding toString
	public String toString() {
		if (this.tail != null)
			return super.getName() + " is a Cat. It has a " + this.tail + ".";
		else
			return super.getName() + " is a Cat. ";
			
	}
	
}
