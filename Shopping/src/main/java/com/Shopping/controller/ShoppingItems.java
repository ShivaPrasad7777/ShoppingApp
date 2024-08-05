package com.Shopping.controller;

public class ShoppingItems {
	String iname;
	int iprize;
	float rating;
	String icat;
	String upName;
	int upPrize;
	String upCat;
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getIprize() {
		return iprize;
	}
	public void setIprize(int iprize) {
		this.iprize = iprize;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getIcat() {
		return icat;
	}
	public void setIcat(String icat) {
		this.icat = icat;
	}
	public String getUpName() {
		return upName;
	}
	public void setUpName(String upName) {
		this.upName = upName;
	}
	public int getUpPrize() {
		return upPrize;
	}
	public void setUpPrize(int upPrize) {
		this.upPrize = upPrize;
	}
	public String getUpCat() {
		return upCat;
	}
	public void setUpCat(String upCat) {
		this.upCat = upCat;
	}
	public String toString() {
		return iname+" "+iprize+" "+rating+" "+icat;
	}
	

}
