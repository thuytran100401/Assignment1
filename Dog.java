/**
 * Assignment 1 exercise 5
 * Dog class
 * @author Thuy Tran
 * February 21, 2022 
 */

public class Dog extends Animal implements Domesticated{
	
    // variables
	private String name;
    private String gender;
	private int age;
	private double speed;

	/**
	 * Constructor of Dog class
	 * @param type of an animal
	 * @param name of a dog
	 * @param environment an animal lives in
	 * @param age of a dog
	 * @param gender of a dog
	 * @param speed of a dog
	 */
	public Dog(String type, String name, int age, String gender, String environment, double speed) {
		super(type, environment);
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.speed = speed;
	}

	/**
	 * getter for a dog's name
	 * @return the dog name
	 */
	public String getName() {
		return name;
	}

    /**
	 * setter for a dog's name
	 * @param name of a dog
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for a dog's age
	 * @return dog's age
	 */
	public int getAge() {
		return age;
	}

    /**
	 * setter for dog's age
	 * @param age of a dog
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * getter for a dog's gender
	 * @return dog's gender
	 */
	public String getGender() {
		return gender;
	}

    /**
	 * setter for a new gender for dog
	 * @param gender of a dog
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * getter for a dog's speed
	 * @return dog's speed
	 */
	public double getSpeed() {
		return speed;
	}


	/**
	 * setter for a new speed for dog
	 * @param speed of a dog
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * convert Dog into a String
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

    // some actions of the dog
	@Override
	public void walk() {
		System.out.println("Walking");
		
	}

	@Override
	public void greetHuman() {
		System.out.println("Tail scales");
		
	}

	@Override
	void move() {
		System.out.println("Running");
	}

	@Override
	void sound() {
		System.out.println("Sound so lound");
	}

	@Override
	void eat() {
		System.out.println("Meat");
	}

	@Override
	void sleep() {
		System.out.println("Sleep in house");
	}

	public void bark() {
		System.out.println("Go Go Go");
	}
	
}