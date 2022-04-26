package BinRel;

public class Pair<T> {
	
	private T first;
	private T second;

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T first() {
		return first;
	}
	
	public T second() {
		return second;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(o.getClass() != getClass())
			return false;
		Pair p = (Pair)o;
		return ((first == p.first()) && (second == p.second()));
	}
	
	@Override
	public String toString() {
		return first().toString() + " " + second().toString() + "\n";
	}
	
	@Override
	public int hashCode() {
		return 
	}
}
