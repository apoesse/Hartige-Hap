package entity.bedien;

import java.util.Date;

public class Bestelregel {
	private Bestelling b = new Bestelling();
	private String naam;
	private int aantal;
	private int tafel;
	private float prijs;
	private BestelStatus status;
	private Date besteltijd;
	
	public Bestelregel(Bestelling b) {
		this.b=b;
		this.naam = b.getNaam();
		this.aantal = b.getAantal();
		this.tafel = b.getTafel();
		this.prijs = b.getPrijs();
		this.status = b.getStatus();
		this.besteltijd = b.getBestelTijd();
	}
	
	public String[] rowInfo(){
		String[] s = {String.valueOf(tafel),naam,String.valueOf(aantal),String.valueOf(status)};
		return s;
	}
}
