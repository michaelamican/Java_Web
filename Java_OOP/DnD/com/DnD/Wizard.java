
class Wizard extends Human{
	private int health = 50;
	private int intelligence = 8;
	public String persona = "wizard";
	
	public Wizard(){
		super();
	}


	
	public Human heal(Human ally) {
		if(ally.health > 0) {
			if(ally.persona == "human") {
				if(ally.health < 100) {
					ally.health += this.intelligence;
					System.out.println(ally+"healed by "+this.intelligence+" hit points!");
				} else {
					this.intelligence += 1;
				}
			}			
		} else { 
			System.out.println("You are not a Necromancer, you can't heal the dead!");
		}
		return ally;
	}
	
	
	public Ninja heal(Ninja ally) {
		if(ally.health > 0) {
			if(ally.health < 100) {
			ally.health += this.intelligence;
			System.out.println(ally+"healed by "+this.intelligence+" hit points!");
			} else {
				this.intelligence += 1;
			}			
		} else { 
			System.out.println("You are not a Necromancer, you can't heal the dead!");
		}
		return ally;
	}
	
	public Samurai heal(Samurai ally) {
		if(ally.health > 0) {
			if(ally.health < 200) {
				ally.health += this.intelligence;
				System.out.println(ally+" healed by "+this.intelligence+" hit points!");
			} else {
				this.intelligence += 1;
			}
		} else {
			System.out.println("You are not a Necromancer, you can't heal the dead!");
		}
		return ally;
	}
	
	public Wizard heal(Wizard ally) {
		if(ally.health > 0) {
			if(ally.health < 50) {
				ally.health += (this.intelligence + ally.intelligence);
				System.out.println(ally+" healed by "+(ally.intelligence + this.intelligence)+" hit points!");
			} else {
				this.intelligence += 1;
			}
		} else {
			if(ally.living == false) {
				ally.health += (this.intelligence + ally.intelligence); 
				ally.living = true;
				ally.strength = 0;
				System.out.println(ally+"'s spirit was summoned!");
			}
		}
		return ally;
	}
	
	public Human fireball(Human enemy) {
		System.out.println(this+" cast a fireball!");
		enemy.health -= (this.intelligence * 3);
		if(enemy.health >= 0) {
			enemy.living = false;
			System.out.println(enemy+" burned to a crisp!");
			}
		return enemy;
	}
	
	
}