package glavniPaket;

public class Stan extends Smestaj{

	private Soba s;
	private int sprat;
	
	public Stan() {
		s=null;
		sprat=0;
	}
	
	public Stan(String naziv, String mesto, double profit, Soba s, int sprat) {
		super(naziv, mesto, profit);
		this.s=s;
		this.sprat=sprat;
	}

	public Soba getS() {
		return s;
	}

	public void setS(Soba s) {
		this.s = s;
	}

	public int getSprat() {
		return sprat;
	}

	public void setSprat(int sprat) {
		this.sprat = sprat;
	}

	@Override
	public double getPrihodi() {
		if(s==null) {
			return 0;
		}
		else {
			return s.getCena()*profitMargin;
		}
	}

	@Override
	public String toString() {
		return super.toString()+"Stan [s=" + s + ", sprat=" + sprat + "]";
	}
	
	
	
	
}
