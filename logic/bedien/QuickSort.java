package logic.bedien;

import java.util.ArrayList;

import entity.bedien.Gerecht;

/**
 * Sorteert gerechten en plaatst deze in interne array
 * 
 * @author 								Alex
 * @see									#getGerechtenAsArrayList()
 * @see									#sorteerGerechtenOpTijd(Gerecht[])
 */
public class QuickSort {
	
	private Gerecht[] gerechten;
	private int aantalGerechten;
	
	public QuickSort() {
		//leeg
	}
	
	/**
	 * Vraag de lijst op van (gesorteerde) gerechten.
	 * 
	 * @return							de lijst met gerechten
	 */
	public ArrayList<Gerecht> getGerechtenAsArrayList(){
		ArrayList<Gerecht> lijst = new ArrayList<Gerecht>();
		if(gerechten!=null){
			for(Gerecht g : gerechten){
				lijst.add(g);
			}
		}
		return lijst;
	}
	
	/**
	 * Sorteer gerechten op volgorde van tijd.
	 * 
	 * @param inputLijst				de te sorteren gerechten
	 * @see								entity.bedien.Gerecht
	 */
	public void sorteerGerechtenOpTijd(Gerecht[] inputLijst){
		if(inputLijst==null || inputLijst.length==0){
			return;//sorteren niet nodig/mogelijk
		}
		this.gerechten = inputLijst;
		this.aantalGerechten = inputLijst.length;
		quickSortGerechten(0,aantalGerechten-1);
	}
	
	/**
	 * Sorteert gerechten in een array op volgorde van klein naar groot
	 * 
	 * Besteltijd is in aantal milliseconden sinds 1970, dus groter getal betekend
	 * jongste bestelling, kleine getal oudste bestelling, dus kleinste getal eerst.
	 * <br><br>
	 * Gebruikt QuickSort algoritme om lijst op bovenstaande volgorde te zetten.
	 * <br><br>
	 * Pak een meetwaarde uit het midden van de lijst en splits deze in linker en 
	 * rechter deel. Ga vervolgens de linkerlijst af en vergelijk de waarde met de
	 * meetwaarde. Is de waarde <b>GROTER</b> dan de meetwaarde ga dan de rechterlijst af
	 * en vergelijke deze waarden met de meetwaarde. Is er een waarde <b>KLEINER</b> dan
	 * de meetwaarde, wissel dan de linker met de rechter. Is er alleen links of 
	 * alleen rechts een afwijkende waarde, wissel deze dan met de meetwaarde. Vervolg
	 * met splitsen van lijst totdat er geen wissels meer zijn en geen lijsten meer zijn.
	 * <br><br>
	 * {@link http://en.wikipedia.org/wiki/Quicksort}
	 * 
	 * @param min						kleinste index array
	 * @param max						grootste index array
	 */
	private void quickSortGerechten(int min, int max){
		int i=min;
		int j=max;
		long pivot = gerechten[min + (max-min)/2].getBestelTijdLong();
		while(i<=j){
			while(gerechten[i].getBestelTijdLong() < pivot){
				i++;
			}
			while(gerechten[j].getBestelTijdLong() > pivot){
				j--;
			}
			if(i<=j){
				wissel(i,j);
				i++;
				j--;
			}
		}
		if(min<j){
			quickSortGerechten(min,j);
		}
		if(i<max){
			quickSortGerechten(i,max);
		}
	}
	
	/**
	 * Wisselt twee gerechten van plaats in de array
	 * 
	 * @param i							index in array van te vervangen gerecht
	 * @param j							index in array van vervangend gerecht
	 */
	private void wissel(int i, int j){
		Gerecht temp = gerechten[i];
		gerechten[i] = gerechten[j];
		gerechten[j] = temp;
	}

}
