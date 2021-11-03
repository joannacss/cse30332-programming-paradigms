public class GenericsExample<T>{
	private T obj;

	public GenericsExample(T obj){
		this.obj = obj;
	}

	public T getObject(){
		return this.obj; // or simply: obj
	}

	public void setObject(T obj){
		this.obj = obj; // here you cannot omit this
	}

	public static void main(String [] args){
		// DEMO: creating an instance of a class for multiple types
			
		// WHY is that we use generics and not simply declare obj as an Object?
		// aren't all classes a subclass of java.lang.Object?
	}
}