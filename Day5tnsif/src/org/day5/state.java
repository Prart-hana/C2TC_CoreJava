package org.day5;

public class state extends Multilevel{
	private String stateName;
	private String language;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName=stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	public String toString() {
		return  "State [stateName=" + stateName + ", Language="+language+ ",CountryName= " + getCountryName()+ ", Capital()=" + getCapital() +"]";
				
	}
	

}
