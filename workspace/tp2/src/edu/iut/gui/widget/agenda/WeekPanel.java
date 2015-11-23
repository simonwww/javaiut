package edu.iut.gui.widget.agenda;

import java.awt.GridLayout;
import java.util.ResourceBundle;

import javax.swing.JPanel;


import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
import edu.iut.app.ApplicationSession;

public class WeekPanel extends EventPanel {

	// Exercice 4
	public enum WeekDayNames {
		EMPTYDAY("",""),
		MONDAY(ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("monday"),ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("mon")),
		TUESDAY(ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("tuesday"),ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("tue")),
		WEDNESDAY(ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("wednesday"),ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("wed")),
		THURSDAY(ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("thursday"),ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("thu")),
		FRIDAY(ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("friday"),ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("fri")),
		SATURDAY(ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("saturday"),ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("sat")),
		SUNDAY(ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("sunday"),ResourceBundle.getBundle("edu.iut.resources.strings", ApplicationSession.instance().getLocale()).getString("sun"));
		
		private String name;
		private String shortName;
		
		WeekDayNames(String name,String shortName) {
			this.name = name;
			this.shortName = shortName;
		}
		
		public String getShortName() {
			return shortName;
		}
		
		public String toString() {
			return name;
		}
	}
	
	public WeekPanel() {
		super(ActiveView.WEEK_VIEW);
		GridLayout daysOfWeekLayout = new GridLayout(1,7);		
		this.setLayout(daysOfWeekLayout);
		for (int di = 0;di<8;di++)	{
			this.add(new DayPanel(ActiveView.WEEK_VIEW,WeekDayNames.values()[di+1]));
		}
	}
}
