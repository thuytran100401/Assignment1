/**
 * Assignment 1, exercise 5 
 * Animal Class
 * @author Thuy Tran
 * February 21, 2022
 */

abstract class Animal {

    // variables
	private String type;
    private String environment;

	/**
	 * Animal class constructor
	 * @param type of an animal
	 * @param environment an animal lives in
	 */
	public Animal(String type, String environment) {
		this.type = type;
		this.environment = environment;
	}

	/**
	 * getter for the type of an animal
	 * @return type of an animal
	 */
	public String getType() {
		return type;
	}

    /**
	 * setter for the type to an animal
	 * @param type of an animal
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * getter for the environment an animal lives in
	 * @return environment an animal lives in
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * setter for the environment an animal lives in
	 * @param environment an animal lives in
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	abstract void move();
	abstract void sound();
	abstract void eat();
	abstract void sleep();
}