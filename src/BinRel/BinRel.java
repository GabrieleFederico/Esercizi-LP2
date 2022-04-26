package BinRel;
import java.util.HashSet;
import java.util.Set;

public class BinRel<T> {
	
	private boolean isSymmetric = false;
	public Set<Pair<T>> relation = new HashSet<>();
	
	public void addPair(T first, T second) {
		relation.add(new Pair<>(first, second));
		if(isSymmetric() && !relation.contains(new Pair<>(second, first)))
			isSymmetric = false;
		if(relation.contains(new Pair<>(second, first)))
			isSymmetric = true;
	}
	
	public boolean isSymmetric() {
		return isSymmetric;
	}
	
	public boolean areRelated(T first, T second) {
		return relation.contains(new Pair<>(first, second));
	}
	
	@Override
	public String toString() {
		String result = "";
		for(Pair p : relation) {
			result += p.toString();
		}
		return result;
	}
	
}
