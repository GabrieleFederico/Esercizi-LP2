package BinRel;
import java.util.HashSet;
import java.util.Set;

public class BinRel<T> {
	
	private int uncoupled;
	private Set<Pair<T>> relation = new HashSet<>();
	
	
	public void addPair(T first, T second) {
		if(relation.add(new Pair<T>(first, second)))
			uncoupled++;
		Pair<T> temp = new Pair<>(second, first);
		
		if(relation.contains(temp)) uncoupled-=2;
		
	}
	
	public boolean isSymmetric() {
		return uncoupled == 0;
	}
	
	public boolean areRelated(T first, T second) {
		return relation.contains(new Pair<>(first, second));
	}
	
	@Override
	public String toString() {
		String result = "";
		for(Pair<T> p : relation) {
			result += p.toString();
		}
		return result;
	}
	
}
