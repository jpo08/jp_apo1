 package model;

public class Species {

	private String name;
	private String cientificName;
	private String migratoryType;
	private TypeSpecie specieType;
	

	public Species(String name, String cientificName, String migratoryType, int specieType) {
		super();
		this.name = name;
		this.cientificName = cientificName;
		this.migratoryType = migratoryType;
		
		switch(specieType) {
		
		case 1: 
			this.specieType = TypeSpecie.terrestrial_flora;
			break;
		case 2: 
			this.specieType = TypeSpecie.aquatic_flora;
			break;
		case 3: 
			this.specieType = TypeSpecie.bird;
			break;
		case 4: 
			this.specieType = TypeSpecie.mammal;
			break;
		case 5: 
			this.specieType = TypeSpecie.aquatic_animal;
			break;			
		}
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCientificName() {
		return cientificName;
	}

	public void setCientificName(String CientificName) {
		this.cientificName = cientificName;
	}

	public String getMigratoryType() {
		return migratoryType;
	}

	public void setMigratoryType(String migratoryType) {
		this.migratoryType = migratoryType;
	}

	
	
	public TypeSpecie getSpecieType() {
		return specieType;
	}

	public void setSpecieType(TypeSpecie specieType) {
		this.specieType = specieType;
	}
	

	@Override
	public String toString() {
		return "Wetland info:\nName: " + name + "\nCientific name: " + cientificName + "\nMigratoryType" + migratoryType + "\nSpecieType: " + specieType;
	}

}