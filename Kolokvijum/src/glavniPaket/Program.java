package glavniPaket;

public class Program {

	public static void main(String[] args) {
		Soba s1 = new Soba();
		Soba s2 = new Soba(3, 100, 1000, false);
		System.out.println(s1);
		System.out.println(s2);
		
		Hotel h1 = new Hotel();
		Hotel h2 = new Hotel("Hotel", "Novi Sad", 0.3);
		System.out.println(h1);
		System.out.println(h2);
		h2.dodajSobu(s1);
		h2.dodajSobu(s2);
		h2.dodajSobu(s2);
		System.out.println(h2);
		h2.izbaciSobu(100);
		h2.izbaciSobu(101);//ovo ocekujemo da nista ne uradi
		System.out.println(h2);
		System.out.println(h2.getPrihodi());
		
		Stan st1 = new Stan();
		Stan st2 = new Stan("Stan", "Novi Sad", 0.1, s2, 2);
		System.out.println(st2);
		System.out.println(st2.getPrihodi());
		
		Evidencija e1 = new Evidencija();
		Evidencija e2 = new Evidencija("Moja evidencija");
		System.out.println(e2);
		e2.dodajSmetaj(h2);
		e2.dodajSmetaj(st2);
		System.out.println(e2);
		e2.izbaciSmestaj("Stan");
		e2.izbaciSmestaj("nestonesto");///ovo ocekujemo da nista ne uradi
		System.out.println(e2);
		
		

	}

}
