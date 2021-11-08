package exceptions;

public class UncheckedExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b; // what happens at this line ?
        System.out.println("c = " + c); // why is this statement never executed?
    }
}