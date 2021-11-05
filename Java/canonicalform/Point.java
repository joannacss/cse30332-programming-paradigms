package canonicalform;
public class Point {
	private int x;
	private int y;

    @Override
	public boolean equals(Object other){
		// reflexive
		if(other == this) 
			return true; 
		// non-null
		if(other == null) 
			return false;
		// don't even bother! they have different types
		if(getClass() != other.getClass()) 
			return false;
		Point point = (Point) other; // why do we need this type cast?
		return x == point.x && y == point.y;
	}

	@Override
	public int hashCode(){
		int hash = 41 + x;
		hash = 41 * hash + y;
		return hash;
	}

}
