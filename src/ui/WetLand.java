package ui;

import java.util.Scanner;

import model.*;

public class WetLand {

	public static Scanner reader;
	public static WetLandController controller;

	public static void main(String[] args) {

		init();
		showMainMenu();
		
		
		
		

	}

	public static void init() {

		reader = new Scanner(System.in);
		controller = new WetLandController () ;
		
	}
	
	public static void showMainMenu() {

		System.out.println("Welcome to Wet");

		boolean stopFlag = false;

		while (!stopFlag){

			System.out.println("\nType an option");
			System.out.println("1. register a wetland");
			System.out.println("2. register a specie");
			System.out.println("3. register a event");
			System.out.println("4. find specie");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();
			
			switch (mainOption) {

			case 1:
				registerWetLand();
				
				break;
			case 2:
				registerSpecies();
				break;
			case 3:
				 registerEvenr();
				break;

			case 0:
				stopFlag = true;
				System.out.println("Thanks for using our system");
				break;
			default:
				System.out.println("You must type a valid option");
				break;

			}

		} 

	}
	
	private static void registerWetLand() {

		System.out.println("Type the name of the wetland ");
		String wetLandname = reader.next();

		System.out.println("Type the ubication zone (1: urban or 2: rural) ");
		int ub = reader.nextInt(); 
		
		String ubication="";
		if(ub ==1){
		
		ubication="urban";
		}
			if(ub ==2){
		
		ubication="rural";
		}
		
	 
		System.out.println("Type if it is public or private");
		String type = reader.nextLine();
		type = reader.nextLine();
		
		System.out.println("Type the size in km2");
		int size = reader.nextInt();
		
		System.out.println("Type the url of the image ");
		String image = reader.nextLine();
		image = reader.nextLine();
		System.out.println("Type if it is protected");
		String protectedWet = reader.nextLine();
		
		if (controller.registerWetLand(wetLandname,ubication,type,size,image,protectedWet)){
			System.out.println("the wetland "+wetLandname+" was sussecfully registered");
		}else {
			System.out.println("the wetland "+wetLandname+" could not be registered");
		}
		
		
	}
	
	private static void registerSpecies() {
		
		if (controller.showWetLands().equals("")){
			System.out.println("there arent any wetlands registered");
		}else {
			
			System.out.println("these are the wetlands currently registered: " + controller.showWetLands());
			
			System.out.println("type the ID of the wetland you want to register a specie: ");
			String wetLandID= reader.next();

			System.out.println("Type the name of the specie ");
			String name = reader.next();

			System.out.println("Type the cientific name ");
			String cientificName = reader.next();
			
			System.out.println("Type if the specie is migratory (yes or no)  ");
			String migratoryType = reader.next();
			
			System.out.println("Type what kind of specie is (1:terrestrial flora, 2:aquatic flora, 3:bird, 4:mammal, 5:aquatic animal) ");
			int specieType = reader.nextInt();
			
			controller.registerSpecies(wetLandID,name,cientificName,migratoryType,specieType);
		}
	}
	
	private static void registerEvenr() {

		if (controller.showWetLands().equals("")){
			System.out.println("there arent any wetlands registered");
		}else {
			
			System.out.println("these are the wetlands currently registered: " + controller.showWetLands());
			
			System.out.println("type the ID of the wetland you want to register a event: ");
			String wetLandID= reader.next();
			
			System.out.println("Type the event date (YYYY-MM-DD): ");
			String eventDate = reader.next();

			int year = Integer.parseInt(eventDate.split("-")[0]);
			int month = Integer.parseInt(eventDate.split("-")[1]);
			int day = Integer.parseInt(eventDate.split("-")[2]);
			
			System.out.println("Type the event owner: ");
			String eventOwner = reader.next();
			
			System.out.println("Type the event value: ");
			double eventValue = reader.nextDouble();
			
			System.out.println("Type the event description: ");
			String eventDescription = reader.next(); 
			
			controller.registerEvents(wetLandID, day, month, year, eventOwner, eventValue, eventDescription);
			
		}
		

	}
	

}