package com.ymtechstudio.assignment7;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		// and continue to add another 10, 20 or 40 more elements
		for (int i = 0; i < 81; i++) {
			myCustomList.add("element ");
		}
		// then you should validate that all the elements you've inserted actually exist
		// in your data structure
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

	}

}
  
