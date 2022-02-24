/**
 * Assignment 1 exercise 5
 * Racoon class
 * @author Thuy Tran
 * February 21, 2022 
 */

public class Racoon extends Animal implements Scratcher{
	
    // variables
	private String name;
    private String gender;
	private int age;
	private double speed;

	/**
	 * Constructor of raccoon class
	 * @param type of an animal
	 * @param name of a raccoon
	 * @param environment an animal lives in
	 * @param age of a raccoon
	 * @param gender of a raccoon
	 * @param speed of a raccoon
	 */
	public Racoon(String type, String name, int age, String gender, String environment, double speed) {
		super(type, environment);
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.speed = speed;
	}

	/**
	 * getter for a racoon's name
	 * @return the racoon name
	 */
	public String getName() {
		return name;
	}

    /**
	 * setter for a racoon's name
	 * @param name of a racoon
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for a racoon's age
	 * @return racoon's age
	 */
	public int getAge() {
		return age;
	}

    /**
	 * setter for racoon's age
	 * @param age of a racoon
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * getter for a racoon's gender
	 * @return racoon's gender
	 */
	public String getGender() {
		return gender;
	}

    /**
	 * setter for a new gender for racoon
	 * @param gender of a racoon
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * getter for a racoon's speed
	 * @return racoon's speed
	 */
	public double getSpeed() {
		return speed;
	}


	/**
	 * setter for a new speed for racoon
	 * @param speed of a racoon
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * convert Racoon into a String
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

    // some actions of the racoon
	@Override
	void move() {
		System.out.println("Moving on the tree");
	}

	@Override
	void sound() {
		System.out.println("Noise sound");
	}

	@Override
	void eat() {
		System.out.println("Omnivores");
	}

	@Override
	void sleep() {
		System.out.println("Sleep in their den.");
	}

    @Override
	public void scratch() {
		System.out.println("Like to scractch the tree and the others that harmful.");
	}
}