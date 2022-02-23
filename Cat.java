/**
 * Assignment 1 exercise 5
 * Cat class
 * @author Thuy Tran
 * February 21, 2022 
 */

public class Cat extends Animal implements Domesticated, Scratcher{
	
    // variables
	private String name;
    private String gender;
	private int age;
	private double speed;

	/**
	 * Constructor of cat class
	 * @param type of an animal
	 * @param name of a cat
	 * @param environment an animal lives in
	 * @param age of a cat
	 * @param gender of a cat
	 * @param speed of a cat
	 */
	public Cat(String type, String name, int age, String gender, String environment, double speed) {
		super(type, environment);
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.speed = speed;
	}

	/**
	 * getter for a cat's name
	 * @return the cat name
	 */
	public String getName() {
		return name;
	}

    /**
	 * setter for a cat's name
	 * @param name of a cat
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for a cat's age
	 * @return cat's age
	 */
	public int getAge() {
		return age;
	}

    /**
	 * setter for cat's age
	 * @param age of a cat
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * getter for a cat's gender
	 * @return cat's gender
	 */
	public String getGender() {
		return gender;
	}

    /**
	 * setter for a new gender for cat
	 * @param gender of a cat
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * getter for a cat's speed
	 * @return cat's speed
	 */
	public double getSpeed() {
		return speed;
	}


	/**
	 * setter for a new speed for cat
	 * @param speed of a cat
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * convert Cat into a String
	 * in a format:
	 * Type: <super.getType()>
	 * Name: <name>
	 * Age: <age> year old
	 * Gender: <gender>
	 * Environment: <super.getEnvironment()>
	 * Speed: <speed>
	 */
	@Override public String toString() {
		return "Type: " + super.getType() +
				"\nName: " + name +
				"\nAge: " + age + " years old" +
				"\nGender: " + gender +
				"\nEnvironment: " + super.getEnvironment() +
				"\nSpeed: " + speed ;
	}

    // some actions of the cat
	@Override
	public void walk() {
		System.out.println("Walking");
		
	}

	@Override
	public void greetHuman() {
		System.out.println("Walk around people or sit near people");
		
	}

	@Override
	void move() {
		System.out.println("Running");
	}

	@Override
	void sound() {
		System.out.println("Mewo Mewo Mewo");
	}

	@Override
	void eat() {
		System.out.println("Meat, Fish, Chicken");
	}

	@Override
	void sleep() {
		System.out.println("Sleep in house");
	}

    @Override
	public void scratch() {
		System.out.println("Go Go Go");
	}
	
}