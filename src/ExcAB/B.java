package ExcAB;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B extends Number{
	
	public static ArrayList<? extends String> l;
	public static Comparator<Number> something;
	
	static List<? extends String> getList() {
		return l;
	}

	public static <T> T getIt(T x) {
		
		return x;
	}
	
	public static Set<String> convert(Set<? super Integer> s){
		HashSet<String> newS = null;
		return newS;
		
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
