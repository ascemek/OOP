package polymorphism;

public class TestAllAnimals {

	public static void main(String[] args) {

		Cat c1 = new Cat("Miny", "long tail");
		Cat c2 = new Cat("Ginger", "ginger tail");
		Dog d1 = new Dog("Bold","black tail");
		Gorilla g1 = new Gorilla("Colo",true);
		Gorilla g2 = new Gorilla("Dolly",false);

		Animal[] animals = new Animal[5]; //Create an array of 5 Animals (say, animals)

		//Put 2 Cats, 1 Dog, and 2 Gorillas in the animal array
		animals[0] = c1;
		animals[1] = c2;
		animals[2] = d1;
		animals[3] = g1;
		animals[4] = g2;

		System.out.println("We have " + animals.length + " animals in our zoo.");
		for (Animal a: animals) {
			System.out.println(a);
			//System.out.println(a.canWalk(walkTypes[i])); // version 03
			a.canEat();
			a.canWalk();
		}

		/*
		 *
		 * Example of polymorphism:
		 *   3 versions of canWalk:
		 *     version 01 in the Animal class: public void canWalk()
		 *     version 02 in the Cat class: public void canWalk()
		 *     version 03 in the Cat class: public String canWalk(String speedType) 
		 * 
		 * In the statement, c1.canWalk();, we are calling version  02
		 * In the statement, c2.canWalk("like a tiger.");, we are calling version 03 
		 *
		 * String[] walkTypes = {"fast", "slowly", "very fast", "like a snail"};
		 *
		 * Cat[] myPets = new Cat[3];
		 * myPets[0] = c1;
		 * myPets[1] = c2;
		 * myPets[2] = new Cat("Bubbly");
		 *
		 * int i = walkTypes.length - 1;
		 *
		 * for (Cat a: myPets) {
		 *	System.out.println(a);
		 *	System.out.println(a.canWalk(walkTypes[i])); // version 03
		 *	a.canEat();
		 *	i--;
		 * }
		 *
		 */
	}
	
}
