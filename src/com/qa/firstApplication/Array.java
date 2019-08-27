package com.qa.firstApplication;

import java.util.ArrayList;

public class Array {
	
	public static void main(String[] args) {
		/*
		String[] row = {"Alex", "Bartek", "Vin"};
		System.out.println(row[0]);
		System.out.println(row[1]);
		System.out.println(row[2]);
		
		//array iteration ---------------------------------------------------------------------
		for (int i = 0; i <row.length;i++){
			System.out.println(row[i]);
		}
		
		
		//enhanced for loop---------------------------------------------------
		for (String each:row) {
			System.out.println(each);
		}
		
		*/
//		String[] row1 = {"Rory", "Adam"};
//		String[] row2 = {"Alex","Bartek", "William"};
//		String [] [] clas = {row1, row2};
//		System.out.println(clas[1][2]);
//		
//		for (String[] row:clas) {
//			for (String person:row) {
//				System.out.println(person);
//			}
//		}
//		
//		for (String[] row:clas) {
//			System.out.println(row);
//		}
//		
//		String [] [] classroom = new String [5][6];
//		classroom[3][4] = "William";
//		System.out.println(classroom[3][4]);
//		
//		
		//ArrayList!!!----------------------------------------------------------------
		//require a Class
		
//		ArrayList<String> row = new ArrayList<String>();
//		row.add("William");
//		System.out.println(row.size());
//		row.add("Dylan");
//		System.out.println(row.size());
//		row.add("martin");
//		System.out.println(row.size());
//		//remove
//		row.remove("Dylan");
//		System.out.println(row.size());
//		
//		for(String person:row)
//		{
//			System.out.println(person);
//		}
		
		ArrayList<ArrayList<String>> clas = new ArrayList<ArrayList<String>>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(50);
		list.add(77);
		
		list.add(64);
		list.remove((Object) 50); // treats it as an Object;
		System.out.println(list);
		
//		for (Integer i:list) {
//			if (i == 50) {
//				continue;
//			}
//			System.out.println(list);
//		}
		
//		}
		
		
		
		
	}

}
