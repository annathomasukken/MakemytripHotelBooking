package com.MakemyTripHotelBooking;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class makemytriphotelbookingTest

{
	makemytriphotelbooking obj = new makemytriphotelbooking();
	 @BeforeClass
	    public void beforeTest() {
		 
	    	obj.initDriver();
	    }
	    
	/* @Test(priority=0)
	    public void verifyDashboardTitle() {
	  	  String actualtitle=obj.login();
	  	  String expectedtitle="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
	  	  Assert.assertEquals(actualtitle, expectedtitle);
	  	  } */
	 @Test(priority=1)
	    public void verifyHotelPageTitle() throws InterruptedException {
	  	  String actualtitle=obj.hotelBookingSearch();
	  	  String expectedtitle="MakeMyTrip.com: Save upto 60% on Hotel Booking 4,442,00+ Hotels Worldwide";
	  	  Assert.assertEquals(actualtitle, expectedtitle);
	  	  }
	 @Test(priority=2)
	    public void verifyHotelListPageTitle() {
	  	  String actualtitle=obj.hotelBookingFilter();
	  	  String expectedtitle="MakeMyTrip";
	  	  Assert.assertEquals(actualtitle, expectedtitle);
	  	  }
	 @Test(priority=3)
	    public void verifyHotelSelectionPageTitle() {
	  	  String actualtitle=obj.hotelBookingSelectHotel();
	  	  System.out.println(actualtitle);
	  	  String expectedtitle = "Make";
	  	  Assert.assertTrue(actualtitle.contains(expectedtitle));
	  	  }
	 @Test(priority=4)
	    public void personalDetailsPageTitle() {
	  	  String actualtitle=obj.hotelBookingPersonalDetailsl();
	  	  System.out.println(actualtitle);
	  	  String expectedtitle = "Makemytrip";
	  	  Assert.assertTrue(actualtitle.contains(expectedtitle));
	  	  }
	 @Test(priority=5)
	    public void paymentDetailsPageTitle()  throws InterruptedException {
	  	  String actualtitle=obj.hotelBookingPaymentDetails();
	  	  System.out.println(actualtitle);
	  	  String expectedtitle = "MakeMytrip";
	  	  Assert.assertTrue(actualtitle.contains(expectedtitle));
	  	  }
}
