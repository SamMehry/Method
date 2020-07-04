package Method;

public class Student {

	// 1. declaring variables
	private String name;
	private int age;

	// 2. create constructors

	// constructor: The job of constructor is to initialize all variables.

	public Student() { // default constructor method- doesn't not have any arguments.

		// assigning default values
		name = "";
		age = 0; // Zero is default value for integer.

	}

	// 3. Parameterized constructor method

	public Student(String newName, int newAge) {

		name = newName;
		age = newAge;

	}

	public Student(String newName) {
		name = newName;
		age = 0; // if we don't pass a field in parameter then we can just assign the default
					// value to it.
	}

	public String getname() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setname(String newName) {
		this.name = newName;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

}
