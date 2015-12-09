package edu.iut.gui.widget.agenda;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.iut.app.ApplicationSession;
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
				daysLayout = new GridLayout(6,4);
				this.setLayout(daysLayout);
				break;
			default:
				daysLayout = new GridLayout(25,1);
				this.setLayout(daysLayout);
				this.add(new JLabel(weekDayNames.toString()));
			}
			int hi = 0 , hj = 1;	
			while(hi<24){
				if (hi == 23)hj =0;
				JPanel hour = new JPanel();
				// EX4 : Creer votre propre widget permettant, l'ajout d'un evenement et d'une personne
				hour.add(new JLabel(new Integer(hi).toString() + ":00 - " + new Integer(hj).toString() + ":00"));
				this.add(hour);
				hi++;
				hj++; 
			}
			break;
		case MONTH_VIEW:
		{	
			int i = 1;
			/*if(ApplicationSession.instance().getMonths()[1] == "february"){
				while(i<28){
					JPanel hour = new JPanel();
					hour.add(new JLabel(new Integer(i).toString()));
					this.add(hour);
					i++;
				}
			}*/
			GridLayout daysOfMonthLayout = new GridLayout(7,5);		
			this.setLayout(daysOfMonthLayout);
			GregorianCalendar calendar = new GregorianCalendar();		
			for (int di = 1;di<=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);di++) {
				JPanel hour = new JPanel();
				hour.add(new JLabel(new Integer(di).toString()));
				this.add(hour);
			}
		}
		break ;
		}
	}
	
	protected void setupUIDayView() {
		
	}
	protected void setupUIWeekView() {
		
	}
	protected void setupUIMonthView() {
		
	}


}
