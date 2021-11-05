package canonicalform;
public class Student1{  
	private int id;  
	private String name;  
	private float gpa;  
	  
	public Student1(int id, String name, float gpa){  
		this.id = id;  
		this.name = name;  
		this.gpa = gpa;  
	}  
      
	public static void main(String args[]){  
		Student1 s1 = new Student1(101,"Elon",4f);  
		Student1 s2 = new Student1(102,"Mark",3.9f);  
         
		System.out.println(s1);//compiler writes here s1.toString()  
		System.out.println(s2);//compiler writes here s2.toString()    
    } 
}	