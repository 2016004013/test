package glavniPaket;

public class Soba {

	private int brojKreveta;
	private int brojSobe;
	private double cena;
	private boolean zauzeta;
	public Soba() {
		brojKreveta=0;
		brojSobe=0;
		cena=0;
		zauzeta=false;
	}
	public Soba(int brojKreveta, int brojSobe, double cena, boolean zauzeta) {
		super();
		this.brojKreveta = brojKreveta;
		this.brojSobe = brojSobe;
		this.cena = cena;
		this.zauzeta = zauzeta;
	}
	public int getBrojKreveta() {
		return brojKreveta;
	}
	public void setBrojKreveta(int brojKreveta) {
		this.brojKreveta = brojKreveta;
	}
	public int getBrojSobe() {
		return brojSobe;
	}
	public void setBrojSobe(int brojSobe) {
		this.brojSobe = brojSobe;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public boolean isZauzeta() {
		return zauzeta;
	}
	public void setZauzeta(boolean zauzeta) {
		this.zauzeta = zauzeta;
	}
	@Override
	public String toString() {
		return "Soba [brojKreveta=" + brojKreveta + ", brojSobe=" + brojSobe + ", cena=" + cena + ", zauzeta=" + zauzeta
				+ "]";
	}
	
	
	
}
