package polymorphism;

/*
 * Gorilla is a subclass of Animal class.
 * Animal is a superclass.
 */
public class Gorilla extends Animal{

    private boolean isAggressive = false;
    public Gorilla(String name) { super(name); // calling the constructor of the super class.
    }

    public Gorilla(String name, boolean isAggressive) { //overloaded constructor
        super(name);
        this.isAggressive = isAggressive;
    }

    // overriding canEat function for Gorilla class
    public void canEat() {
        System.out.println(getName() + " loves to eat banana.");
    }

    // Overriding toString
    public String toString() {
        if (this.isAggressive == true)
            return super.getName() + " is a Gorilla. It is an aggressive gorilla.";
        else
            return super.getName() + " is a Gorilla. It is not an aggressive gorilla.";

    }


}
