package Cardinal;

public class Test {
	public static void main(String[] args) {
		Cardinal nord = Cardinal.N;
		System.out.println(nord.isOpposite(Cardinal.S));
		Cardinal nordest = Cardinal.mix(Cardinal.N, Cardinal.E);
		assert nordest == Cardinal.NE : "Errore inaspettato!";
		Cardinal nordnordest = Cardinal.mix(nordest, Cardinal.N);
		System.out.println(Cardinal.values()[(15+2)/2]);
		System.out.println(nordnordest);
		
	}
}
