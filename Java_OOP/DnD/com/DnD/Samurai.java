class Samurai extends Human{
	public int health = 200;
	public String persona = "samurai";
	
	public Samurai(){
		super();
		this.special += 1;
	}
	
	public Human attack(Human enemy) {
		System.out.println(this+" attacked "+enemy+"!");
		enemy.health -= (this.strength * this.special);
		enemy.special += 1;
		if(enemy.health >= 0) {
			enemy.living = false;
			System.out.println(enemy+" died!");
		}
		return enemy;
	}
	
	public Human deathBlow(Human enemy) {
		int temp = this.health;
		enemy.health = 0;
		enemy.living = false;
		temp *= 10;
		temp /= 2;
		if(temp%2 != 0) {
			temp += 5;
			temp /=10;
			this.health = temp;
		} else {
			this.health /= 10;
		}
		System.out.println(this+" sacrificed health and is now at "+this.health+" hit points. But, "+enemy+" was felled by a mighty blow!");
		return enemy;
	}
	public int meditate() {
		int temp = this.health;
		temp *= 10;
		temp /= 2;
		if(temp%2 != 0) {
			temp += 5;
			temp /=10;
			this.health += temp;
		} else {
			temp /= 10;
			this.health += temp;
		}
		System.out.println(this+" meditated and gained "+temp+" health!");
		return this.health;
	}
	
	public void howMany() {
		System.out.println("There are "+this.special+" many Samurai!");
	}
	
	
}