package edu.iut.gui.widget.agenda;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
import edu.iut.gui.widget.agenda.WeekPanel.WeekDayNames;

public class DayPanel extends EventPanel {

	public DayPanel(ActiveView activeView,WeekDayNames weekDayNames) {
		super(activeView);
		switch (activeView) {
		case DAY_VIEW:
			
			
		case WEEK_VIEW:
			GridLayout daysLayout;
			switch(weekDayNames) {
			case EMPTYDAY:
				daysLayout = new GridLayout(24,1);
				this.setLayout(daysLayout);
				break;
			default:
				daysLayout = new GridLayout(25,1);
				this.setLayout(daysLayout);
				this.add(new JLabel(weekDayNames.toString()));
			}
						
			for (int hi = 0;hi<24;hi++) {
				JPanel hour = new JPanel();
				// EX4 : Creer votre propre widget permettant, l'ajout d'un evenement et d'une personne
				hour.add(new JLabel(new Integer(hi).toString()));
				this.add(hour);
			}
			break;
		case MONTH_VIEW:
			JPanel hour = new JPanel();
			hour.add(new JLabel("H"));
			this.add(hour);
		
		}
	}
	
	protected void setupUIDayView() {
		
	}
	protected void setupUIWeekView() {
		
	}
	protected void setupUIMonthView() {
		
	}


}
