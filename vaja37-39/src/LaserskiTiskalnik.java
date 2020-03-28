//definiramo razred, ki razširi alserski tiskalnik
public class LaserskiTiskalnik extends Tiskalnik {
	
	//vse lastnosti, deklarirane v nadrazredu se prenesejo
	//deklariramo samo nove
	private boolean jePrizgan;
	private int steviloListov;
	
	//deklariramo konstruktor
	//vhod: kapaciteta tonerja
	public LaserskiTiskalnik(int t, String m) {
		
		//pred super ne sme biti nič drugega
		//pokličemo konstruktor nadrazreda
		super(1000, "LaserJet");
		
		//določimo ostale lastnosti
		jePrizgan = false;
		steviloListov = 200;
	}
	
	//deklariramo nov konstruktor
	//vhod: je barven 1/0, printerja, kapaciteta tonerja
	public LaserskiTiskalnik(int t, boolean p, int s) {
		
		//pokličemo konstruktor nadrazreda
		super(t, "LaserJet");
		
		//določimo ostale lastnosti
		jePrizgan = p;
		steviloListov = s;
	}
	
	public int getSteviloListov() {
							
			return steviloListov;
			}	
	
	public int printamo(int porabaListov) throws Exception {
		//izpraznimo vsebino
		steviloListov -=  porabaListov;
		
		if(jePrizgan) {
			//preverimo, da ni stevilo listov v minus
			if(steviloListov < 0) {
				
				//postavimo količino vsebine na 0
				steviloListov = 0;
		
				//izpišemo izjemo
				throw new Exception("Hej, ni dovolj PAPIRJA!!!");
			}
			}		
			else {		
				throw new Exception("Printer ni prizgan, zato ne mores tiskati!!!");
					//vrne vrednost lastnosti kolicinaVsebine
			}
		return steviloListov;	
	}
}	