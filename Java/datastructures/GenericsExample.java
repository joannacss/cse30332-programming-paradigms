public class GenericsExample<T>{
	private T obj;

	public GenericsExample(T obj){
		this.obj = obj;
	}

	public static void main(String [] args){
		// DEMO: creating an instance of a class
		GenericsExample<String> set = new HashSet<>();
		
		

		// DEMO: how can we make this print in order?
		// is there a way to do so with minimal changes to this code?
		for(String str: set)
			System.out.println(str);
	}
}