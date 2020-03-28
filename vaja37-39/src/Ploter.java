//definiramo razred, ki razširi alserski tiskalnik
public class Ploter extends Tiskalnik {
	
	//vse lastnosti, deklarirane v nadrazredu se prenesejo
	//deklariramo samo nove
	private boolean papirVstavljen;
	private int naplotamLahko;
	private int zaNatisniti;
	private String modelPloterja;
	
	//deklariramo konstruktor
	//vhod: kapaciteta tonerja
	
	public Ploter(int t, String m) {
		
		//pred super ne sme biti nič drugega
		//pokličemo konstruktor nadrazreda
		super(t, "Ploter HP DesignJet");
		
		//določimo ostale lastnosti
		papirVstavljen = false;
		modelPloterja = m;
		naplotamLahko = t/3;
	}
	
	//deklariramo nov konstruktor
	//vhod: je barven 1/0 printerja, kapaciteta tonerja
	public Ploter(int t, String m, boolean p, int n) {
		
		
		//pokličemo konstruktor nadrazreda
		super(t, "HP ploter");
		
		//določimo ostale lastnosti
		papirVstavljen = p;
		zaNatisniti = n;
		modelPloterja = m;
		naplotamLahko = t/3;
	}
	
	public boolean getPapirVstavljen() {									
		return papirVstavljen;
	}
	public int getZaNatisniti() {
		return zaNatisniti;
	}
	public String getModelPloterja() {	
		return modelPloterja;
	}
	public int getNaplotamLahko() {	
		return naplotamLahko;
	}


	public int plotamo(int ploti) throws Exception {
		//izpraznimo vsebino
		naplotamLahko -= ploti;
		
		//če je papir vstavljen...
		if(papirVstavljen) {
			//če je količina barve manjsa od nic jo postavimo na 0
			if(naplotamLahko < 0) {
				naplotamLahko=0;
				//vrze opozorilo da ni barve
				throw new Exception("Zmanjkalo ti je crnila!!! Preden zacnes s plotanjem zamenjaj kartuso.");
			}					
		}
		else {		
			//vrne vrednost lastnosti kolicinaVsebine		
			throw new Exception("Nimas papirja!!!");
		}		
		//vrne vrednost lastnosti kolicinaVsebine
		return naplotamLahko;
		//return kolicinaBarve;	
	}
}		
