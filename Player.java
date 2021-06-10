import java.util.ArrayList;
import java.util.Scanner;
public class Player {
private String Name;
private String Email;
private String Password;
private int PlayerCounter ;
private String Phone;
static ArrayList<Player> Player_list;
Booking b1;
Sign_Up p1;
public Player() {
	
}

public Player(String Name, String Email, String Password,String Phone,ArrayList<Player> Player_list) {
	this.Name=getName();
	this.Email=getEmail();
	this.Password=getPassword();
	this.Phone=getPhone();
	this.Player_list= new ArrayList<>();
	
	}



public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public int getPlayerCounter() {
	return PlayerCounter;
}

public void setPlayerCounter(int playerCounter) {
	PlayerCounter = playerCounter;
}

public String getPhone() {
	return Phone;
}

public void setPhone(String phone) {
	Phone = phone;
}

public ArrayList<Player> getPlayer_list() {
	return Player_list;
}

public void setPlayer_list(ArrayList<Player> player_list) {
	Player_list = player_list;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}



public Booking getB1() {
	return b1;
}



public void setB1(Booking b1) {
	this.b1 = b1;
}
public void Display() {
	for(int i=0; i<b1.Booking_list.size();i++) {
		int j=1;
		System.out.println(j+"Playground Name: "+b1.getPlayground_Name()+"\nLocation: "+b1.ground.getLocation()+"\nBooking Hours: "+b1.getB_Hours());
		System.out.println("\n*******************************");
		j++;	}
		
	}




}

