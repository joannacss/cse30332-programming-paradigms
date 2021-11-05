package canonicalform;
public class Student2{  
	private int id;  
	private String name;  
	private float gpa;  
	  
	public Student2(int id, String name, float gpa){  
		this.id = id;  
		this.name = name;  
		this.gpa = gpa;  
	}  
     
    @Override
	public String toString(){ //overriding the toString() method  
		return String.format("%d: %s\t%f", id, name, gpa);  
	} 

	public static void main(String args[]){  
		Student2 s1 = new Student2(101,"Elon",4f);  
		Student2 s2 = new Student2(102,"Mark",3.9f);  
         
		System.out.println(s1);//compiler writes here s1.toString()  
		System.out.println(s2);//compiler writes here s2.toString()    
    } 
}	
