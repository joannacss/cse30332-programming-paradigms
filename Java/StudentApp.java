public class StudentApp{
	public static void main(String args[]){
		Student s1 = new Student("Elon Musk", 4.0f);
		TA ta = new TA("Joe Smith", 3.9f, "FA21-CSE-30332-01", "MW 1-2PM");
		System.out.println(s1.getName() + "\t" + s1.getGPA());
		System.out.println(ta.getName() + "\t" + ta.getGPA()+ "\t" + ta.getOfficeHours()+ "\t" + ta.getCourseSection());
	}
}