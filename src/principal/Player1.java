package principal;

public class Player1 {
	private String name;
	private String weapon;
	private int health;
	
	public Player1(String name, String weapon, int health) {
		this.name=name;
		this.weapon=weapon;
		   if (health <= 0 || health > 100){
		        this.health = 100;
		    } else {
		        this.health = health;
		    }
	}
	
    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public void damageGun1() {
		health-=40;
		if (health <= 0) System.out.println(name+ " is dead!! ");
		else  System.out.println(getName()+" is hit by gun 1. Health reduced by 40. New health : "+health);
	}
	
	public void damageGun2() {
		health-=50;
		if (health <= 0) System.out.println(name+ " is dead!! ");
		else System.out.println(getName()+" is hit by gun 2. Health reduced by 50. New health : "+health);
	}
	
	public void heal() {
		if(health>0 && health<100) {
			health=100;
			System.out.println(name + " is healed, health restored to "+health);
		}else {
			System.out.println(name + " is dead, health can't be restored!!");
		}
	}
}
