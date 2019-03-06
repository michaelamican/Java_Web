import java.lang.Math;

class Ninja extends Human {
	public int stealth = 10;
	public String persona = "ninja";

	public Ninja() {
		super();
		}
	
	public int runAway() {
		if(this.special > 0) {
			if(this.health > 10) {
				double chance = this.special*Math.random()*10;
				if(chance > 5) {
					System.out.println("Run away!");
					this.health -= 10;
				}
			}
		} else {
			System.out.println("Run away failed.");
		}
		return this.health;
	}
	
	public Human steal(Human enemy) {
		if(this.special > 0) {
			if(this.health > 10) {
				double chance = this.special*Math.random()*10;
				if(chance > 5) {
					System.out.println("Snatched!");
					this.health += this.stealth;
					this.stealth += 1;
					enemy.health -= this.stealth;
					System.out.println("Ninja's health is now: "+this.health);
					System.out.println("Ninja's stealth is now: "+this.stealth);
					if(enemy.health >= 0) {
						enemy.living = false;
						System.out.println(enemy+" died!");
					}
				}
			}
		} else {
			this.special += 1;
			System.out.println("Steal failed!");
		}
		return enemy;
	}
	
}
