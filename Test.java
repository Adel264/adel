import java.util.ArrayList;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    Main_menu();
  }
   public static void Main_menu(){
    Scanner input= new Scanner(System.in);
      System.out.println("Welcome to Captain Maged System\n");
      System.out.println("1- Sign Up   \n2- Sign In  \n3- Exit");
       int Choise=input.nextInt();
       switch(Choise) {
       case 1:
         SignUp();
         break;
       case 2:
         SignIn();
         break;
      default:
        break;
      
       }
      
        } 
        
private static void SignUp()
  {
     Scanner input= new Scanner(System.in);
     System.out.println("Please enter your Name: ");
     String Name=input.nextLine();
     System.out.println("Please enter your Email: ");
     String Email=input.nextLine();
     System.out.println("Please enter your Password: ");
     String Password=input.nextLine();
     System.out.println("Please enter your Phone: ");
     String Phone=input.nextLine();
     Sign_Up Acc=new Sign_Up(Name,Email, Password, Phone);
     System.out.println("1- Player"+"\n2- Playground Owner");
     int Choise=input.nextInt();
     switch(Choise) 
     {
     case 1:
     {
       Player player= new Player(Acc.getName(),Acc.getEmail(),Acc.getPassword(),Acc.getPhone(),null);
       Player.Player_list.add(player);
       Main_menu();
       break;
     }
     case 2:
       {
       Playground_Owner p1= new Playground_Owner(Acc.getName(),Acc.getEmail(),Acc.getPassword(),Acc.getPhone(),null);
       Playground_Owner.Owner_list.add(p1);
       Main_menu();
       break; 
       }
       
   }    
     }


private static void SignIn() {
  Scanner input= new Scanner(System.in);
    System.out.println("1- Player"+"\n2- Playground Owner");
     int Choise=input.nextInt();
     switch(Choise) {
     case 1:
     {
    	 Scanner in= new Scanner(System.in);
    System.out.println("Please enter your Email: ");
    String Email=in.nextLine();
    System.out.println("Please enter your Password: ");
    String Password=in.nextLine();
    for (int i=0;i<Player.Player_list.size();i++) {
       if(Player.Player_list.get(i).getEmail()==Email&& Player.Player_list.get(i).getPassword()==Password) {
            System.out.println("Hello "+Player.Player_list.get(i).getName());
            Player_menu();}
       else {  
         System.out.println("Wrong Account");
         SignIn();
       }
}
      break;
     }
     case 2:{
    	 Scanner inn= new Scanner(System.in);
      System.out.println("Please enter your Email: ");
    String Email1=inn.nextLine();
    System.out.println("Please enter your Password: ");
    String Password1=inn.nextLine();
    for (int i=0;i<Playground_Owner.Owner_list.size();i++) {
       if(Playground_Owner.Owner_list.get(i).getEmail()==Email1 && Playground_Owner.Owner_list.get(i).getPassword()==Password1) {
            System.out.println("Hello "+Playground_Owner.Owner_list.get(i).getName());
            Owner();}
       else {
         System.out.println("Wrong Account");
         SignIn();
       }
       }
       break;
     }
     default:
         break;
       }

     }
private static void Player_menu(){
  Scanner input= new Scanner(System.in);
       System.out.println("1- Search about Playground \n2- List of Bookings \n3- Main menu");
      int Choise_1=input.nextInt();
       switch(Choise_1) {
       case 1:
       {
         System.out.println("Please enter Playground Name: ");
         String Playground_Name=input.nextLine();
         System.out.println("Please enter Location: ");
         String Location=input.nextLine();
         SearchPlayground search=new SearchPlayground(Playground_Name,Location);
         search.Display();
         System.out.println("Please enter Playground Name: ");
         String Name=input.nextLine();
         if(Name==search.getPlayground_Name()) {
           Booking b1 = new Booking();
           search.ground=b1.ground;
         }
         else {System.out.println("Wrong Name");}
         Player_menu();
         break;
       }
       
       case 2:
       {
        Player player=new Player();
        player.Display();
        Player_menu();
        break;
       }
       case 3:
         Main_menu();
         break;
       }

   
     }

     

private static void Owner(){
  Scanner input= new Scanner(System.in);
        System.out.println("1- Add Palyground \n2- Display All Requsts \n3- Exit");
        int Choise=input.nextInt();
       switch(Choise) {
       case 1:{
         System.out.println("Please enter your Location: ");
         String Location=input.nextLine();
         System.out.println("Please enter your Playground_Name: ");
         String Playground_Name=input.nextLine();
         System.out.println("Please enter your Date: ");
         String Date=input.nextLine();
         System.out.println("Please enter your B_Hours as 2(pm or am): ");
         String B_Hours=input.nextLine();
         System.out.println("Please enter your Prices: ");
         int Prices=input.nextInt();
         Playground ground=new Playground(Location,Playground_Name,Date,B_Hours,Prices);
         Owner();
         break;}
       case 2:{
         Playground_Owner p1= new Playground_Owner();
         System.out.println("The Requsts are:");
         p1.Requsts();  
      Owner();
      break;
                 }
       default:
         break;
       
       }
       
   
}










}