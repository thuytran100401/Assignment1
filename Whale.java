/**
 * Assignment 1 exercise 5
 * Whale class
 * @author Thuy Tran
 * February 21, 2022 
 */

public class Whale extends Animal implements Swimmer{
	
    // variables
	private String name;
    private String gender;
	private int age;
	private double speed;

	/**
	 * Constructor of whale class
	 * @param type of an animal
	 * @param name of a whale
	 * @param environment an animal lives in
	 * @param age of a whale
	 * @param gender of a whale
	 * @param speed of a whale
	 */
	public Whale(String type, String name, int age, String gender, String environment, double speed) {
		super(type, environment);
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.speed = speed;
	}

	/**
	 * getter for a whale's name
	 * @return the whale name
	 */
	public String getName() {
		return name;
	}

    /**
	 * setter for a whale's name
	 * @param name of a whale
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for a whale's age
	 * @return whale's age
	 */
	public int getAge() {
		return age;
	}

    /**
	 * setter for whale's age
	 * @param age of a whale
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * getter for a whale's gender
	 * @return whale's gender
	 */
	public String getGender() {
		return gender;
	}

    /**
	 * setter for a new gender for whale
	 * @param gender of a whale
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * getter for a whale's speed
	 * @return whale's speed
	 */
	public double getSpeed() {
		return speed;
	}


	/**
	 * setter for a new speed for whale
	 * @param speed of a whale
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * convert Whale into a String
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

    // some actions of the whale
	@Override
	public void swim() {
		System.out.println("Swiming in ocean");
		
	}

	@Override
	void move() {
		System.out.println("Moving in ocean");
	}

	@Override
	void sound() {
		System.out.println("Its sound in the range of 10 Hz to 31 kHz, and it is amazing.");
	}

	@Override
	void eat() {
		System.out.println("Fish and sea creatures");
	}

	@Override
	void sleep() {
		System.out.println("Resting quietly in the water, or sleep while swimming slowly next to another animal.");
	}	
}