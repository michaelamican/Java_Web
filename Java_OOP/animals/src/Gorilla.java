
class Gorilla extends Mammal{

	
	
	public Gorilla() {
		super(100);
	}
	public int throwSomething() {
		this.energy -= 5;
		System.out.println("Gorilla threw something!");
		return energy;
	}
	public int throwSomething(String str) {
		this.energy -= 5;
		System.out.println("Gorilla threw a "+str);
		return energy;
	}
	public int eatBanana() {
		this.energy += 10;
		System.out.println("Gorilla ate a banana!");
		System.out.println("Gorilla is pleased.");
		return energy;
	}
	public int climb() {
		this.energy -= 10;
		System.out.println("Gorilla is climbing!");
		return energy;
	}
	
}
