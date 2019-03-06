
class Bat extends Mammal{

	
	public Bat() {
		super(100);
		this.energy = 300;
	}
	
	public int fly() {
		System.out.println("Fly, my pretty, fly!");
		energy -= 50;
		return energy;
	}
	public int eatHumans() {
		System.out.println("Tasty humans");
		energy += 25;
		return energy;
	}
	public int eatHumans(String str) {
		System.out.println("Snacked on "+str+"'s remains!");
		energy += 25;
		return energy;
	}
	public int attackTown() {
		System.out.println("Town destroyed!");
		energy -= 100;
		return energy;
	}
}
