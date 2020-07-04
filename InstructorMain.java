package Method;

public class InstructorMain {

	public static void main(String[] args) {

		
		
		Instructor t = new Instructor("Dale");
		
		t.setTeacher("Tom");
		
		t.setTeacher("Ali");
		t.setExperience(4);
		
		System.out.println(t.getExperience()+" "+t.getTeacher());
		
	}

}
