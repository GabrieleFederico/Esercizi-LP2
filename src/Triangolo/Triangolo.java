package Triangolo;
public class Triangolo {

	private double a;
	private double b;
	private double c;
	
	public Triangolo(double a, double b, double c) throws Exception {
		if(canBeTriangle(a, b, c)) {
			this.a = a;
			this.b = b;
			this.c= c;
		}
		else
			throw new IllegalArgumentException();
	}
	
	public double getArea() {
		double semiPerimetro = calcolaSemiPerimetro();
		
		return (Math.sqrt(semiPerimetro*(semiPerimetro - a) * (semiPerimetro - b) * (semiPerimetro - c)));
	}
	
	private double calcolaSemiPerimetro() {
		return (a + b + c)/2;
	}
	
	private boolean canBeTriangle(double a, double b, double c) {
		return ((a < b+c) && (b < a+c) && (c < a+b));
	}
	
	public class Rettangolo extends Triangolo{
		public Rettangolo(double cateto1, double cateto2) throws Exception{
			super(cateto1, cateto2, Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
			
		}
	}
	
	public class Isoscele extends Triangolo{
		public Isoscele(double lato, double base) throws Exception{
			super(lato, lato, base);
		}
		
	}

}
