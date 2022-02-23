/**
 * Assignment 1 exercise 5
 * AnimaleTest class
 *   create one instance of the classes Dog, Cat, Racoon, and Whale.
 *   On each instance call each one of the possible functionalities.
 * 
 * @author Thuy Tran
 * February 21, 2022 
 */

import java.util.ArrayList;

public class AnimalTest {
	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<>();

        // create a new instance for Dog
		Dog dog = new Dog("Dog", "Ben", 2, "male", "house", 30.00);
		list.add(dog);

        // create a new instance for Cat
		Cat cat = new Cat("Cat", "Tom", 1, "male", "house", 30.00);
		list.add(cat);

        // create a new instance for Whale
		Whale whale = new Whale("Whale", "Jen", 6, "famale", "ocean", 35.00);
		list.add(whale);

        // create a new instance for Raccoon
		Raccoon raccoon = new Raccoon("Raccoon", "Vin", 2, "female", "house", 15.00);
		list.add(raccoon);

        // display the animals information and its possible functionalities
		for (int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i).toString());
			list.get(i).move();
			list.get(i).sound();
			list.get(i).eat();
			list.get(i).sleep();
			if(list.get(i).getType() == "Dog") {
				dog.greetHuman();
				dog.walk();
				dog.bark();
			}
			else if(list.get(i).getType() == "Cat") {
				cat.greetHuman();
				cat.walk();
				cat.scratch();
			}
			else if(list.get(i).getType() == "Whale") {
				whale.swim();
			}
			else if(list.get(i).getType() == "Raccoon") {
				raccoon.scratch();
			}
			System.out.println("\n-----------------------------------------\n");
		}
	}
}