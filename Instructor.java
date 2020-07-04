package Method;

public class Instructor {

	private String teacher;
	private int experience;

	public Instructor() {
		System.out.println("Blank Constructor");

	}

	public Instructor(String Prof) {
		teacher = Prof;

	}

	public Instructor(String Prof, int experience) {

		teacher = Prof;
		experience = experience;
		
	
		}

	

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getTeacher() {
		return teacher;
	}

	public int getExperience() {
		return experience;
	}

}
