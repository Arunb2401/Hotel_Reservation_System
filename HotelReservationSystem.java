package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;

public class HotelReservationSystem {
	static ArrayList<Hotel> HotelsList = new ArrayList<>();
	
	public static void view() { 
		          for (Hotel i : HotelsList) { 
		              System.out.println(i); 
		          }
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System Program.");

		Hotel LakeWood = new Hotel();
		LakeWood.setHotelName("LakeWood");
		LakeWood.setRatePerDay(110);
		HotelsList.add(LakeWood);

		Hotel RidgeWood = new Hotel();
		RidgeWood.setHotelName("RidgeWood");
		RidgeWood.setRatePerDay(150);
		HotelsList.add(RidgeWood);

		Hotel BridgeWood = new Hotel();
		BridgeWood.setHotelName("BridgeWood");
		BridgeWood.setRatePerDay(220);
		HotelsList.add(BridgeWood);

		view();

        // create LocalDate object
        LocalDate localdate
            = LocalDate.of(2020, 5, 13);
  
        // print full date
        System.out.println("Date: " + localdate);
}
	}
