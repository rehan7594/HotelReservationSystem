package com.bridgelabz;

import java.io.IOException;

public class HotelReservationSystem {
	private static MyHotel lake, bridge, ridge;

	public static void main(String[] args) throws IOException {

		hotelDetails();

	}

	public static void hotelDetails() {
		System.out.println("Hotels and their Prices for Regular Customer \n");

		//setting values for lakewood
		lake = new MyHotel("Lakewood");
		lake.setRegularWeekDay(110);
		lake.setRegularWeekEnd(90);
		System.out.println("HotelName: "+ lake.getHotelName()+"\n"+"Regular WeekDay Price: "+lake.getRegularWeekDay()+"$\n"+"Regular WeekEnd Price: "+lake.getRegularWeekEnd()+"$\n");

		//setting values for bridgewood
		bridge = new MyHotel("Bridgewood");
		bridge.setRegularWeekDay(160);
		bridge.setRegularWeekEnd(60);;
		System.out.println("HotelName: "+ bridge.getHotelName()+"\n"+"Regular WeekDay Price: "+bridge.getRegularWeekDay()+"$\n"+"Regular WeekEnd Price: "+bridge.getRegularWeekEnd()+"$\n");

		//setting values for ridgewood   
		ridge = new MyHotel("Ridgewood");
		ridge.setRegularWeekDay(220);
		ridge.setRegularWeekEnd(150);
		System.out.println("HotelName: "+ ridge.getHotelName()+"\n"+"Regular WeekDay Price: "+ridge.getRegularWeekDay()+"$\n"+"Regular WeekEnd Price: "+ridge.getRegularWeekEnd()+"$\n");

	}
}