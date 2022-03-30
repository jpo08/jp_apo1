package model;

public class Events {

	private Date evenDate;
	private String eventOwner;
	private double eventValue;
	private String eventDescription;
	

	public Events(int day, int month, int year, String eventOwner, double eventValue, String eventDescription) {
		super();
		this.evenDate = new Date(day, month, year);
		this.eventOwner = eventOwner;
		this. eventValue= eventValue;
		this.eventDescription = eventDescription;

	}

	
	public void setEventDate(Date evenDate) {
		this.evenDate = evenDate;
	}

	public void setEventDate(int day, int month, int year) {
		this.evenDate = new Date(day, month, year);
	}

	public String getEventOwner() {
		return eventOwner;
	}

	public void setEventOwner(String eventOwner) {
		this.eventOwner = eventOwner;
	}

	public double getEventValue() {
		return eventValue;
	}

	public void setEventValue(double eventValue) {
		this.eventValue = eventValue;
	}
	
	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	

	@Override
	public String toString() {
		return "event info:\nName: "  ;
	}

}