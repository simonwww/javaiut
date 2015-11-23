package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle a faire ici, penser a utiliser instanceof
		for (IApplicationLog filteredLogs_i : filteredLogs) {
			if (filteredLogs_i instanceof ApplicationErrorLog)
				filteredLogs.add(filteredLogs_i);
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle a faire ici, penser a utiliser instanceof
		
		for (IApplicationLog filteredLogs_i : filteredLogs) {
			if (filteredLogs_i instanceof ApplicationInfoLog)
				filteredLogs.add(filteredLogs_i);
		}
		
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle a faire ici, penser a utiliser instanceof
		
		for (IApplicationLog filteredLogs_i : filteredLogs) {
			if (filteredLogs_i instanceof ApplicationWarningLog)
				filteredLogs.add(filteredLogs_i);
		}
		
		return filteredLogs;
	}
	

}
