package com.qa.firstApplication;

import java.util.ArrayList;

public class HouseList extends Catcat{
	private final ArrayList<String> catList = new ArrayList<>();
	public void addToList() {
		catList.add("Geof");
		
	}
	public void setcatList(ArrayList<Catcat> catList) {
		this.catList = catList;
		
	}

}
