package entity.bedien;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Bevat alle bestellinginformatie voor een Gerecht.
 * 
 * @author Alex
 * @see						data.bedien.DAOBestelling
 */
public class Gerecht {
	private String naam;
	private int aantal;
	private int tafel;
	private Date bestelTijd;
	private BestelStatus status;
	private Type type;
	private int id;
	
	public Gerecht() {
		//default
	}
	/**
	 * Geeft de naam als String
	 * 
	 * @return				Naam
	 */
	public String getNaam() {
		return naam;
	}

	/**
	 * Zet de naam van het gerecht
	 * 
	 * @param naam			De naam
	 */
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	/**
	 * Geeft het bestelde aantal van het gerecht
	 * 
	 * @return				Het aantal
	 */
	public int getAantal() {
		return aantal;
	}
	
	/**
	 * Zet het aantal van een gerecht
	 * 
	 * @param aantal		Het aantal
	 */
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
	
	/**
	 * Geeft het tafelnummer
	 * 
	 * @return				Het tafelnummer
	 */
	public int getTafel() {
		return tafel;
	}
	
	/**
	 * Zet het tafelnummer
	 * 
	 * @param tafel			Het tafelnummer
	 */
	public void setTafel(int tafel) {
		this.tafel = tafel;
	}

	/**
	 * Geeft de besteltijd als datum Object
	 * 
	 * @return				De besteltijd
	 */
	public Date getBestelTijd() {
		return bestelTijd;
	}
	
	/**
	 * Zet de besteltijd
	 * 
	 * @param bestelTijd	De besteltijd
	 */
	public void setBestelTijd(Date bestelTijd) {
		this.bestelTijd = bestelTijd;
	}
	
	/**
	 * Geeft de status van het bestelde gerecht
	 * 
	 * @return				De bestelstatus
	 * @see					entity.bedien.BestelStatus
	 */
	public BestelStatus getStatus() {
		return status;
	}
	
	/**
	 * Zet de status van het bestelde gerecht
	 * 
	 * @param status		De bestelstatus
	 * @see					entity.bedien.BestelStatus
	 */
	public void setStatus(BestelStatus status) {
		this.status = status;
	}
	
	/**
	 * Geeft het type van het gerecht
	 * 
	 * @return				Het type
	 * @see					entity.bedien.Type
	 */
	public Type getType() {
		return type;
	}
	
	/**
	 * Zet het type van het gerecht
	 * 
	 * @param type			Het type
	 * @see					entity.bedien.Type
	 */
	public void setType(Type type) {
		this.type = type;
	}
	
	/**
	 * Geeft de besteltijd als aantal milliseconden sinds 1970
	 * 
	 * @return				De besteltijd
	 */
	public long getBestelTijdLong(){
		return bestelTijd.getTime();
	}
	
	/**
	 * Geeft de besteltijd als geformatteerde string
	 * 
	 * @return				De besteltijd
	 */
	public String getBestelTijdStringFormated(){
		SimpleDateFormat df = new SimpleDateFormat("E hh:mm:ss");
		return df.format(bestelTijd);
	}
	
	/**
	 * Geeft het ID uit de database van het gerecht
	 * 
	 * @return				Het ID
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * Zet het ID van het gerecht
	 * 
	 * @param id			Het ID
	 */
	public void setID(int id) {
		this.id = id;
	}


}
