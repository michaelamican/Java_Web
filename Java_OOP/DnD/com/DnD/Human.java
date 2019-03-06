
public class Human {
	public int health;
	public int strength;
	public int stealth;
	public int intelligence;
	public int special;
	public String persona;
	public boolean living;
	
	public Human() {
		this.health = 100;
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.special = 0;
		this.living = true;
		this.persona = "human";
	}
	
	public Human attack(Human human) {
		System.out.println(this+" attacked "+human+"!");
		human.health -= this.strength;
		human.special += 1;
		if(human.health >= 0) {
			human.living = false;
			System.out.println(human+" died!");
		}
		return human;
	}
	public void displayHealth() {
		System.out.println("Health: "+this.health);
	}

}
