package logic.bedien;

import java.util.ArrayList;

import entity.bedien.Bestelling;
import entity.bedien.Bestelregel;
import entity.bedien.Drankbestelling;
import entity.bedien.Gerecht;
import entity.bedien.Maaltijdbestelling;
import entity.bedien.Type;

/**
 * Bevat de systeemlogica voor Bedienen.
 * 
 * @author Alex
 * @see								#init()
 * @see								#getBestellingenAsString(Type)
 */
public class BedienManager {
	private Bestelling bestelling;
	private ArrayList<Drankbestelling> drankbestellingen;
	private ArrayList<Maaltijdbestelling> maaltijdbestellingen;
	public BedienManager(){
		//init();
	}
	
	/**
	 * Maakt nieuw bestelling aan om te vullen
	 */
	private void init(){
		bestelling = new Bestelling();
	}
	
	/**
	 * Geeft op basis van een type bestelling een String array met gesorteerde
	 * bestelwaarden terug.
	 * 
	 * @see							entity.bedien.Gerecht
	 * @see							entity.bedien.Type
	 * @param t						Het type bestelling
	 * @return						Waarden voor de tabel
	 */
//	public ArrayList<String[]> getBestellingenAsString(Type t){
//		ArrayList<Gerecht> bestellingen = getBestellingen(t);
//		ArrayList<String[]> b = new ArrayList<String[]>();
//		for(int i=0;i<bestellingen.size();i++){
//			Gerecht g = bestellingen.get(i);
//			String[] values = {String.valueOf(g.getTafel()),
//								g.getNaam(),
//								String.valueOf(g.getAantal()),
//								String.valueOf(g.getStatus()),
//								g.getBestelTijdStringFormated()};
//			b.add(values);
//		}
//		return b;
//	}
	public ArrayList<Bestelregel> getDrankBestellingenAsString(){
		ArrayList<Bestelregel> b = new ArrayList<Bestelregel>();
		for(Drankbestelling d : drankbestellingen){
			b.add(new Bestelregel(d));
		}
		return b;
	}
	
	public ArrayList<Bestelregel> getMaaltijdBestellingenAsString(){
		ArrayList<Bestelregel> b = new ArrayList<Bestelregel>();
		for(Maaltijdbestelling m : maaltijdbestellingen){
			b.add(new Bestelregel(m));
		}
		return b;
	}
	
	/**
	 * Geeft gerechten terug op basis van type, gesorteerd op besteltijd.
	 * 
	 * @param t						Het type gerecht
	 * @return						Gerechten
	 * @see							entity.bedien.Type
	 * @see							entity.bedien.Gerecht
	 * @see							entity.bedien.Bestelling#getGerecht(int)
	 * @see							logic.bedien.QuickSort#sorteerGerechtenOpTijd(Gerecht[])
	 */
//	private ArrayList<Gerecht> getBestellingen(Type t){
//		init();
//		int aantal = bestelling.getAantalGerechten();
//		ArrayList<Gerecht> ger = new ArrayList<Gerecht>();
//		for(int i=0;i<aantal;i++){
//			if(bestelling.getGerecht(i).getType()==t){
//				ger.add(bestelling.getGerecht(i));
//			}
//		}
//		Gerecht[] g = new Gerecht[ger.size()];
//		g = ger.toArray(g);
//		QuickSort qs = new QuickSort();
//		qs.sorteerGerechtenOpTijd(g);
//		return qs.getGerechtenAsArrayList();
//	}	
}
