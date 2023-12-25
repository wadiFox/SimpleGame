package principal;

public class Player2 extends Player1{
    private int health;
    private boolean armour;
	public Player2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		  if (health <= 0 || health > 100) {
		        this.health = 100;
		    } else {
		        this.health = health;
		    }
		this.armour=armour;
	}
	@Override
	public void damageGun1() {
      if(armour) {
    	  health-=20;
    	  if(health<=0) {
    		  System.out.println(getName()+" is dead!!!");
    	  }else {
    		  System.out.println(getName()+" Armour is On. Hit by gun 1. Health reduced by 20. New health : "+health);
    	  }
      }
      if(!armour) {
    	  health-=30;
    	  if(health<=0) {
    		  System.out.println(getName()+" is dead!!!");
    	  }else {
    		  System.out.println(getName()+" Armour is Off. Hit by gun 1. Health reduced by 30. New health : "+health);
    	  }
      }
	}
	@Override
	public void damageGun2() {
		   if(armour) {
		    	  health-=30;
		    	  if(health<=0) {
		    		  System.out.println(getName()+" is dead!!!");
		    	  }else {
		    		  System.out.println(getName()+" Armour is On. Hit by gun 2. Health reduced by 30. New health : "+health);
		    	  }
		      }
		      if(!armour) {
		    	  health-=40;
		    	  if(health<=0) {
		    		  System.out.println(getName()+" is dead!!!");
		    	  }else {
		    		  System.out.println(getName()+" Armour is Off. Hit by gun 2. Health reduced by 40. New health : "+health);
		    	  }
		      }
	}
	@Override
	public void heal() {
		if(health>0 && health<100) {
			health=100;
			System.out.println(getName() + " is healed, health restored to "+health);
		}else {
			System.out.println(getName() + " is dead, health can't be restored!!");
		}
	}
		
}
