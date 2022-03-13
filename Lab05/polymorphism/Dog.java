package polymorphism;

/*
 * Dog is a subclass of Animal class.
 * Animal is a superclass.
 */
public class Dog extends Animal{
    private String tail;

    public Dog(String name, String tail) { //overloaded constructor
        super(name);
        this.tail = tail;
    }

    // overriding canEat function for Dog class
    public void canEat() {
        System.out.println(getName() + " loves to eat dog food.");
    }

    // Overriding toString
    public String toString() {
        if (this.tail != null)
            return super.getName() + " is a Dog. It has a " + this.tail + ".";
        else
            return super.getName() + " is a Dog. ";

    }
}
