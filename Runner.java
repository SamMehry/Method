package Method;

public class Runner {

	public static void main(String[] args) {

		Student st1 = new Student(); // calling default constructor before creating parameterized constructor.

		Student st2 = new Student("Shams", 21); // calling parameterized constructor method

		// System.out.println(st2.name);// we can print it this way only if it is
		// public.

		Student st3 = new Student("Pak");
		st3.setAge(33);
		st3.setname("John");

		System.out.println(st3.getname());

	}

}
