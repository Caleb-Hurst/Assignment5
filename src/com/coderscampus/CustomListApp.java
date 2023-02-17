package com.coderscampus;



public class CustomListApp {
	public static void main(String[] args) {
		CustomArrayList<String> myCustomList = new CustomArrayList<>();
			myCustomList.add("Journee Audrea");
			myCustomList.add("Rodolph Rosalin");
			myCustomList.add("Kim Colene");
			myCustomList.add("Lemoine Zenia");
			myCustomList.add("Easton Archie");
			myCustomList.add("Julyan Digby");
			myCustomList.add("Nigellus Farley");
			myCustomList.add("Cymone Christabella");
			myCustomList.add("Benjy Ainslie");
			myCustomList.add("Gabriella Zelda");
			myCustomList.add("Kaelea Alisha");
			
			// getting the size of my Array
			System.out.println(myCustomList.getSize());
			
			//getting a specific index
			System.out.println(myCustomList.get(0));
			
			
			for(int i = 0 ; i < myCustomList.getSize(); i++) {
				System.out.println(myCustomList.get(i));
			}
	}
}
