//VAJA 37-39 ====================================================================
//avtor: Tone Škulj
//predmet Programiranje1


//vključimo paket za delo z IO napravami
import java.io.*;
import java.util.*;

//Deklariramo javni razred - ime datoteke mora biti enako imenu razreda
public class Erudio {
	
	//deklariramo statično lastnost za vnos iz konzole
	private static BufferedReader vnos;

	//deklariramo statičen seznam ploterjev
	private static ArrayList<Ploter> ploterji;

	//deklariramo še statičen seznam laserjev - da ne bo isto, bomo tu vprašali po kolicini crnila
	private static ArrayList<LaserskiTiskalnik> laserji;

	//Definiramo glavno metodo
	public static void main(String[] args) {
	

	//inicializiramo lastnosti
	vnos = new BufferedReader(new InputStreamReader(System.in));
	ploterji = new ArrayList<Ploter>();

	
	//deklariramo in inicializiramo lokalne spremenljivke
	String modelPloterja = "neznan ploter";
	int z = 0;
		
	//z zanko vhile zajemamo vnos iz konzole dokler vrednost ni enaka "" - kar naj bi bil ENTER	
	while(modelPloterja.length()>0) {
		//poskusimo vprašati po znamki ploterja
		try {
			System.out.print("Vnesi znamko ploterja st." + (z+1) +  ": ");
			modelPloterja = vnos.readLine();
		}
		//če bi bila sporočena izjema
		catch(Exception e) {
			System.err.println("Napaka:" + e);
		}
		//če je vrednost daljša od 0 znakov, dodamo nov ploter na seznam
		if (modelPloterja.length()>0) {
			ploterji.add(new Ploter(500, modelPloterja, true, 30));		
			z+=1;
		}

	} //konec for zanke	

	//inicializiramo lastnosti - tokrat za array laserji
	vnos = new BufferedReader(new InputStreamReader(System.in));
	laserji = new ArrayList<LaserskiTiskalnik>();

	//dodamo presledek med zanki
	System.out.println(System.lineSeparator());		
	
	//deklariramo in inicializiramo lokalno spremenljivko
	int kolikoPrahu = 0;
	int zl = 0;
	String kolikoPrahuStr = "test";
	
	//z zanko vhile zajemamo vnos iz konzole dokler vrednost ni enaka "" - kar naj bi bil ENTER
	while(kolikoPrahuStr.length() > 0) {
		//poskusimo vprašati koliko prahu je v tonerju
		try {
			System.out.print("Koliko g prahu je v tonerju " + (zl+1) + ". laserja: ");
			kolikoPrahuStr = vnos.readLine();
			if(kolikoPrahuStr != "") {
				kolikoPrahu = Integer.parseInt(kolikoPrahuStr);
				zl+=1;
			}
		}
		//če bi bila sporočena izjema
		catch(Exception e) {
			System.err.println("Napaka:" + e);

		}
		//dodamo novo ploter na seznam
		laserji.add(new LaserskiTiskalnik(kolikoPrahu, true, 30));
	} //konec for zanke	


	System.out.println(System.lineSeparator());
	System.out.println("==========================VAJA-33=================================="); 
	System.out.println("||                PROGRAMIRANJE 1 - Tone Skulj                   ||");
	System.out.println("===================================================================");
	System.out.println("PRVI PODRAZRED - PLOTER"); 	
	System.out.println("Vnesli ste " + z + " objektov tipa PLOTER."); 	
	
	//izpišemo vsebino seznama ploterjev
	for(int c=0; c<(z); c++) {
		System.out.println("Ploter st." + (c+1) + " se imenuje " + ploterji.get(c).getModelPloterja() + ".");
	}

	System.out.println(System.lineSeparator());	
	
	//izpišemo vsebino seznama laserjev - kolicina prahu
	System.out.println("DRUGI PODRAZRED - LASER");
	System.out.println("Vnesli ste " + zl + " objektov tipa LASERSKI TISKALNIK."); 		
	for(int c=0; c<zl; c++) {
		System.out.println("Toner v laserju st." + (c+1) + " vsebuje " + laserji.get(c).getKolicinaCrnila() + "g prahu.");
	}
	
	System.out.println("==========================VAJA-33-konec============================");
//==VAJA32== konec ==============================================================================
	}	
}