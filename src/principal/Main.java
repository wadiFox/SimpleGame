package principal;

public class Main {

	public static void main(String[] args) {
		Player1 player = new Player1("sam", "sword", 200);// I gave 200 in health, but it will be 100, it is encapsulated in the constructor to forbid change over 100
        player.damageGun1();
        player.damageGun2();
        player.damageGun1();
        player.heal();
        
        
       Player2 bestPlayer = new Player2("wadi","gun", 300, true);// I gave 300 in health, but it will be 100, it is encapsulated in the constructor to forbid change over 100
 	   bestPlayer.damageGun1();
 	   bestPlayer.damageGun2();
 	   bestPlayer.damageGun1();
 	   bestPlayer.damageGun2();
 	   bestPlayer.heal();
 	   
 	  Player2 bestPlayer1 = new Player2("Carl","gun", 300, false);
	   bestPlayer1.damageGun1();
	   bestPlayer1.damageGun2();
	   bestPlayer1.heal();
	}
	
	   
}
