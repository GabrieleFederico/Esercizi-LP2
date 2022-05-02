package Range;

public class Range<T extends Comparable<T>> {

	private T min;
	private T max;
	
	public Range(T min, T max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean isInside(T x) {
		return x.compareTo(min) >= 0 && x.compareTo(max) <= 0;
	}
	
	/* Completa perché specificando Range<T> stiamo evitando a priori
	   il tentativo di passare range di un tipo diverso*/
	public boolean isOverlapping(Range<T> x) {
		return x.isInside(min) || x.isInside(max) || isInside(x.min) || isInside(x.max);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj.getClass() != getClass())
			return false;
		
		Range<T> temp = (Range)obj;
		
		return min.equals(temp.min) && max.equals(temp.max);
	}
	
	@Override
	public int hashCode() {
		return min.hashCode() ^ max.hashCode();
	}
}
