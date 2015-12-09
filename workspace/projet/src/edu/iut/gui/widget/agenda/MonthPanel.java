package edu.iut.gui.widget.agenda;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JPanel;

import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
import edu.iut.gui.widget.agenda.WeekPanel.WeekDayNames;

public class MonthPanel extends EventPanel {

	public MonthPanel() {
		super(ActiveView.MONTH_VIEW);
		
		setLayout(new GridLayout(1,1));
		//for (int di = 0;di<calendar.getActualMaximum(Calendar.DAY_OF_MONTH);di++) {
			JPanel day = new DayPanel(ActiveView.MONTH_VIEW,WeekDayNames.EMPTYDAY);
			this.add(day);
		//}
	}
}
