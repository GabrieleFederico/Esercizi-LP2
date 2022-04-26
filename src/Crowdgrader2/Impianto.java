package Crowdgrader2;
import java.util.ArrayList;
import java.util.List;

public class Impianto {
	
	private double potenzaMassimaErogata;
	private double potenzaAttuale;
	private ArrayList<Apparecchio> apparecchiCollegati = new ArrayList<Apparecchio>();	
	
	public Impianto(double potenza) {
		potenzaMassimaErogata = potenza;
	}
	
	public void collega(Apparecchio a) {
		/*Controllo per evitare che se si collega un apparecchio 
		 acceso possa essere superato il massimo della potenza erogata*/
		if(a.isOn() && superamentoMassimoPotenza(a))
			throw new RuntimeException();
		
		if(a.isOn())
			aggiornaPotenzaAttuale(a.getPotenzaAssorbita());
			
		apparecchiCollegati.add(a);
		a.setImpianto(this);
	}
	
	public double potenza() {
		return potenzaAttuale;
	}
	
	public double getPotenzaMassimaErogata() {
		return potenzaMassimaErogata;
	}
	
	public boolean superamentoMassimoPotenza(Apparecchio a) {
		return potenza() + a.getPotenzaAssorbita() > potenzaMassimaErogata;
		
	}
	
	protected void aggiornaPotenzaAttuale(double potenza) {
		potenzaAttuale += potenza;
	}

}
