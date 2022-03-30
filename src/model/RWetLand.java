 package model;

public class RWetLand {

	private String name;
	private String ubication;
	private String type;
	private int size;
	private String image;
	private String protectedWet;
	private Species [] species;
	private Events [] events;

	public RWetLand(String name, String ubication, String type, int size, String image, String protectedWet) {
		super();
		this.name = name;
		this.ubication = ubication;
		this.type = type;
		this.size = size;
		this.image = image;
		this.protectedWet = protectedWet;
		species = new Species[100];
		events = new Events[100];

	}
	public boolean addSpecie(String name, String cientificName, String migratoryType, int specieType) {

		boolean stopFlag = false;
		Species mySpecie = new Species(name,cientificName,migratoryType,specieType);

		for (int i = 0; (i < species.length) && !stopFlag; i++) {
			if (species[i] == null) {
				species[i] = mySpecie;
				stopFlag = true;
			}
		}

		return stopFlag;
	}
	
	public boolean addEvent(int day, int month, int year, String eventOwner, double eventValue, String eventDescription) {

		boolean stopFlag = false;
		Events myEvent = new Events(day, month, year, eventOwner, eventValue, eventDescription);

		for (int i = 0; (i < events.length) && !stopFlag; i++) {
			if (events[i] == null) {
				events[i] = myEvent;
				stopFlag = true;
			}
		}

		return stopFlag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size= size;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String getProtectedWet () {
		return protectedWet;
	}

	public void setProtectedWet(String protectedWet) {
		this.protectedWet = protectedWet;
	}
	
	public Species[] getSpecies() {
		return species;
	}

	public void setSpecies(Species[] species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Wetland info:\nName: " + name + "\nUbication: " + ubication + "\nType" + type + "\nSize km: " + size + "\nImage: "+ image + "\nProtected: "+ protectedWet;
	}

}
