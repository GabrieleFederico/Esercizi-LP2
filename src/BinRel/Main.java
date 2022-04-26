package BinRel;

public class Main {

	public static void main(String args[]) {
		BinRel<String> rel = new BinRel<>();
		rel.addPair("a", "albero");
		System.out.print(rel.relation.contains(new Pair("a", "albero")));
		rel.addPair("a", "amaca");
		System.out.println(rel.isSymmetric());
		rel.addPair("albero", "a");
		rel.addPair("amaca", "a");
		System.out.println(rel.isSymmetric());
		System.out.println(rel.areRelated("a", "amaca"));
		
		Pair<String> p1 = new Pair<>("albero", "a");
		Pair<String> p2 = new Pair<>("albero", "a");
		
		System.out.print(p1.equals(p2));
		
	}
}
