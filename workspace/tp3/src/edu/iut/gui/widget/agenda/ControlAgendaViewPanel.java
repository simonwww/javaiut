package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.ApplicationSession;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		/** EX3: REMPLACEMENT DU BOUTON NEXT */
		Calendar calendar = Calendar.getInstance();
		
		JComboBox<String> jours = new JComboBox<String>();
		for (String j : ApplicationSession.instance().getDays()){
			jours.addItem(j);
		}
		jours.setSelectedItem(Calendar.DAY_OF_WEEK);
		this.add(jours);
		
		JComboBox<String> mois = new JComboBox<String>();
		for (String m : ApplicationSession.instance().getMonths()){
			mois.addItem(m);
		}
		mois.setSelectedItem(ApplicationSession.instance().getMonths()[calendar.get(Calendar.DAY_OF_MONTH)]);
		this.add(mois);
		
		int annee = calendar.get(Calendar.YEAR);
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(annee , 2010 , 2020 , 1));
		
		this.add(spinner);
	}
	
	public int getYear() {
		return selectedYear;
	}
	public int getMonth() {
		return selectedMonth;
	}
	public int getDay() {
		return selectedDay;
	}
	
}
