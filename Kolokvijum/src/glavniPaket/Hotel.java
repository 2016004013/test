package glavniPaket;

import java.util.ArrayList;

public class Hotel extends Smestaj{

	ArrayList<Soba> sobe = new ArrayList<Soba>();
	
	
	
	public Hotel() {
		//sledeca linije nije neophodna jer smo vec inicijalizovali u 7 liniji
		//ukoliko se odlucimo da u konsturktorima inicijalizujemoo listu, onda moramo u svakom konsturktoru da je inicjializujemo
		//sobe=new ArrayList<Soba>();
	}
	
	public Hotel(String naziv, String mesto, double profit) {
		super(naziv, mesto, profit);
	}

	public boolean dodajSobu(Soba s) {
		for(Soba so:sobe) {
			if(so.getBrojSobe()==s.getBrojSobe()) {
				return false;
			}
		}
		
		return sobe.add(s);
	}
	
	public boolean izbaciSobu(int brojSobe) {
		int toRemove=-1;
		
		for(int i=0;i<sobe.size();i++) {
			if(sobe.get(i).getBrojSobe()==brojSobe) {
				toRemove=i;
				break;
			}
		}
		
		if(toRemove==-1) {
			return false;
		}
		else {
			return sobe.remove(toRemove) != null;
		}
	}

	@Override
	public double getPrihodi() {
		int suma=0;
		
		for(int i=0;i<sobe.size();i++) {
			suma+=sobe.get(i).getCena();
		}
		
		return suma*profitMargin;
		//ukoliko polje profitMargin nije bilo protected, mogli smo napisati - suma*getProfitMargin()
	}

	@Override
	public String toString() {
		return super.toString()+"Hotel [sobe=" + sobe + "]";
	}
	
	

}
