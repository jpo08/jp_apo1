package model;

public class WetLandController {
	
	private RWetLand []wetlands;
	
	public  WetLandController() {
		
		wetlands = new RWetLand[80];
	}
	
	public boolean registerWetLand(String wetLandname,String ubication, String type, int size, String image, String protectedWet){
		
		boolean stopFlag= false;
		
		RWetLand myWetLand = new RWetLand(wetLandname,ubication,type,size,image,protectedWet);
		
		
		
		for(int i = 0; i<wetlands.length && !stopFlag; i++){
			
			if(wetlands[i]==null){
				
				wetlands[i] = myWetLand;
				stopFlag = true;
			}
		}
		
		return stopFlag;
	}
	
	public String showWetLands(){
		String msg= "";
		
		for(int i = 0; i< wetlands.length; i++) {
			if (wetlands[i] !=null){
				msg+="\n"+(i+1)+"."+wetlands[i].getName();
			}
		}
		return msg;
	}
	
	public boolean registerSpecies(String wetLandID, String name, String cientificName, String migratoryType, int specieType){
		
		boolean stopFlag= false;
		
		
		for(int i = 0; i<wetlands.length && !stopFlag; i++){
			
			if(wetlands[i]==null){
				
				if((i+1+"").equals(wetLandID)){
					stopFlag= wetlands[i].addSpecie (name,cientificName,migratoryType,specieType);
					
				}
				
				
			}
		}
		
		return stopFlag;
	}
	
	public boolean registerEvents(String wetLandID, int day, int month, int year, String eventOwner, double eventValue, String eventDescription){
		
		boolean stopFlag= false;
		
		
		for(int i = 0; i<wetlands.length && !stopFlag; i++){
			
			if(wetlands[i]==null){
				
				if((i+1+"").equals(wetLandID)){
					stopFlag= wetlands[i].addEvent(day,month, year, eventOwner, eventValue, eventDescription);
					
				}
				
				
			}
		}
		
		return stopFlag;
	}
	
}