package entity.bedien;

import java.util.Date;

/**
 * Bevat alle bestelde gerechten met daarin benodigde informatie.
 * 
 * @author Alex
 * @see						#addGerecht(Gerecht)
 * @see						#getGerecht(int)
 * @see	 					data.bedien.DAOBestelling
 */
public class Bestelling{
	//private ArrayList<Gerecht> gerechtenLijst = new ArrayList<Gerecht>();
	
//	public Bestelling(){
//		Gerecht[] ger = dao.getBesteldeGerechten();
//		for(Gerecht g : ger){
//			addGerecht(g);
//		}
//	}
//	
//	/**
//	 * Voegt een gerecht toe aan de lijst met gerechten
//	 * 
//	 * @param g				Een gerecht
//	 * @see					Gerecht
//	 */
//	public void addGerecht(Gerecht g){
//		gerechtenLijst.add(g);
//	}
//	
//	/**
//	 * Vraagt een gerecht op uit de lijst met gerechten
//	 * 
//	 * @param key			De index van het gerecht
//	 * @return				Een gerecht
//	 * @see					Gerecht
//	 */
//	public Gerecht getGerecht(int key){
//		return gerechtenLijst.get(key);
//	}
//	
//	/**
//	 * Geeft het aantal gerechten in de interne lijst
//	 * 
//	 * @return				Aantal gerechten
//	 */
//	public int getAantalGerechten(){
//		return gerechtenLijst.size();
//	}
	
	private String naam;
	private int aantal;
	private int tafel;
	private float prijs;
	private BestelStatus status;
	private Date besteltijd;
	
	public Bestelling(){
		
	}
	
	public String getNaam(){
		return naam;
	}
	
	public void setNaam(String naam){
		this.naam = naam;
	}
	
	public int getAantal(){
		return aantal;
	}
	
	public void setAantal(int aantal){
		this.aantal = aantal;
	}
	
	public int getTafel(){
		return tafel;
	}
	
	public void setTafel(int tafel){
		this.tafel = tafel;
	}
	
	public float getPrijs(){
		return prijs;
	}
	
	public void setPrijs(float prijs){
		this.prijs = prijs;
	}
	
	public BestelStatus getStatus(){
		return status;
	}
	
	public void setStatus(BestelStatus status){
		this.status = status;
	}
	
	public void getBestelTijd(Date d) {
		this.besteltijd = d;
	}
	
	public Date getBestelTijd() {
		return besteltijd;
	}
}
