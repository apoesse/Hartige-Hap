package gui.bedien;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import entity.bedien.Type;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import logic.bedien.BedienManager;

/**
 * Bevat de GUI elementen voor Weergave Bestellingen
 * 
 * @author Alex
 */
@SuppressWarnings("serial")
public class BestellingenPanel extends JPanel {
	private JTable drankTabel;
	private JTable gerechtTabel;
	private BedienManager manager = new BedienManager();

	/**
	 * Create the panel.
	 */
	public BestellingenPanel() {
		setLayout(null);
		
		JButton btnVervers = new JButton("Ververs");
		btnVervers.setBounds(459, 321, 89, 23);
		add(btnVervers);
		
		JScrollPane scrollPaneDranken = new JScrollPane();
		scrollPaneDranken.setBounds(10, 11, 417, 429);
		add(scrollPaneDranken);
		
		JScrollPane scrollPaneGerechten = new JScrollPane();
		scrollPaneGerechten.setBounds(587, 11, 417, 429);
		add(scrollPaneGerechten);
		
		String[] c1 = {"Tafel","Drank","Aantal","Status","Besteltijd"};
		drankTabel = new JTable(new BedieningTableModel(c1));
		scrollPaneDranken.setViewportView(drankTabel);
				
		String[] c2 = {"Tafel","Maaltijd","Aantal","Status","Besteltijd"};
		gerechtTabel = new JTable(new BedieningTableModel(c2));
		scrollPaneGerechten.setViewportView(gerechtTabel);
		
		//listeners
		btnVervers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				updateTables();
			}
		});
	}
	
	/**
	 * Update de tabellen voor weergave.
	 * 
	 * @see						logic.bedien.BedienManager#getBestellingenAsString(Type)
	 */
	private void updateTables(){
//		BedieningTableModel m1 = (BedieningTableModel) drankTabel.getModel();
//		BedieningTableModel m2 = (BedieningTableModel) gerechtTabel.getModel();
//		//ArrayList<String[]> drankbestellingen = manager.getBestellingenAsString(Type.DRANK);
//		//ArrayList<String[]> gerechtbestellingen = manager.getBestellingenAsString(Type.GERECHT);
//		m1.removeAllRows();
//		for(int i=0;i<drankbestellingen.size();i++){
//			m1.addNewRow(drankbestellingen.get(i));
//		}
//		m2.removeAllRows();
//		for(int i=0;i<gerechtbestellingen.size();i++){
//			m2.addNewRow(gerechtbestellingen.get(i));
//		}
	}
}
