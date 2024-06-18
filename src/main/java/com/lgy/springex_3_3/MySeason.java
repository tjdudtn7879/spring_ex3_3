package com.lgy.springex_3_3;

public class MySeason {
	int month;
	Season season;
	
	public void result() {
		season.rsltSeason(month);
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	
	
}
