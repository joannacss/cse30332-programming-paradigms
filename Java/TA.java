public class TA extends Student{
	private String officeHours;
	private String courseSection;

	public TA(String name, float gpa, String officeHours, String courseSection){
		super(name,gpa);
		this.officeHours = officeHours;
		this.courseSection = courseSection;
	}

	public String getOfficeHours(){
		return this.officeHours;
	}

	public String getCourseSection(){
		return this.courseSection;
	}
}