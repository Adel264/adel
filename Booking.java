import java.util.ArrayList;

public class Booking {
	private String Location;
	private String Playground_Name;
	private String B_Hours;
	private String Date;
	private int BookingCounter;
	static ArrayList<Booking> Booking_list;
	Playground ground;
	public Booking() {}
	public Booking(String B_Hours,String Data, String Date) {
		this.B_Hours=B_Hours;
		this.Date=Date;
			}
	public Booking(ArrayList<Booking> Booking_list) {
		Booking.Booking_list=Booking_list;
	}
	public String getB_Hours() {
		return B_Hours;
	}
	public void setB_Hours(String b_Hours) {
		B_Hours = b_Hours;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
public void Display() {
	for(int i=0;i<Booking_list.size();i++) {
		int j=1;
		System.out.println(j+"- Playground Name: "+ground.getPlayground_Name()+"\nLocation: "+ground.getLocation()+"\nBooking Hours: "+this.getB_Hours());
		System.out.println("/n*******************************8");
		j++;
	}
	
	
}

public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public String getPlayground_Name() {
	return Playground_Name;
}
public void setPlayground_Name(String playground_Name) {
	Playground_Name = playground_Name;
}
public Playground getGround() {
	return ground;
}
public void setGround(Playground ground) {
	this.ground = ground;
}
public int getBookingCounter() {
	return BookingCounter;
}
public void setBookingCounter(int bookingCounter) {
	BookingCounter = bookingCounter;
}
public ArrayList<Booking> getBooking_list() {
	return Booking_list;
}
public void setBooking_list(ArrayList<Booking> booking_list) {
	Booking_list = booking_list;
}

}
