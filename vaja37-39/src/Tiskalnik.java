//deklariramo javni razred
public class Tiskalnik {
	
	//deklariramo lastnosti
	private String modelTiskalnika;
	private float kapaciteta;
	private float kolicinaCrnila;
	private float stanje;
	
	//deklariramo konstruktor s katerim ustvarimo nov objekt - mora biti enako imenu datoteke in imenu razreda
	//vhod: kapaciteta in vrsta vsebine
	//vrne: nov objekt razreda Tiskalnik
	public Tiskalnik(int k, String m) {
		
		//inicializiramo začetnelastnosti
		modelTiskalnika = m;
		kapaciteta = k;
		kolicinaCrnila = k;

		
	} //konec konstruktorja
	
	//metoda, ki vrne količino vsebine
	//vhod: /
	//izhod: kolicinaCrnila
	public float getKolicinaCrnila() {
	
		//vrne vrednost lastnosti kolicinaCrnila
		return kolicinaCrnila;
	}
	//metoda za praznenje kartuse
	//vhod: količina, ki smo jo izpraznili
	//izhod: koliko je še ostalo
	
	public float izpraznimo(float poraba) throws Exception {


		//izpraznimo vsebino
		kolicinaCrnila -=  poraba;
		
		
		//preverimo, da ni količina v minus
		if(kolicinaCrnila <= 0) {
			
			//postavimo količino vsebine na 0
			kolicinaCrnila = 0;
	
			//izpišemo izjemo
			throw new Exception("Ni dovolj crnila!!!");
		}
		return kolicinaCrnila;
	
	}
	
	public float getStanje() {
		
		float stanje = kolicinaCrnila/kapaciteta*100;
		return stanje;
		
		
	}


	
	
}