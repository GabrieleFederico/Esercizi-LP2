package Crowdgrader2;

public class Apparecchio {

	private double potenzaAssorbita;
	private boolean isOn;
	private Impianto impianto;
	
	public Apparecchio(double potenza) {
		potenzaAssorbita = potenza;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	protected void setImpianto(Impianto i) {
		impianto = i;
	}
	
	public double getPotenzaAssorbita() {
		return potenzaAssorbita;
	}
	
	public void on() {
		//Se non è collegato ad un impianto non ha senso controllare che superi o meno la potenza massima
		if(impianto != null && impianto.superamentoMassimoPotenza(this))
			throw new RuntimeException();
		isOn = true;
		impianto.aggiornaPotenzaAttuale(potenzaAssorbita);
	}
	
	public void off() {
		isOn = false;
		impianto.aggiornaPotenzaAttuale(-potenzaAssorbita);
	}
}
