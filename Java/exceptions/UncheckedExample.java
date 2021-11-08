package exceptions;

class Student{
    private String name;
    public String getName(){
        return name;
    }
}

public class UncheckedExample {

    public static void main(String[] args) {
        Student s = new Student();
        boolean b = s.getName().equals("Melinda"); // why is this statement problematic?
        System.out.println("b = " + b); // why is this never executed?
    }
}