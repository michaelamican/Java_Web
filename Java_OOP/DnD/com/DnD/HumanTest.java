
public class HumanTest {
	public static void main(String[] args) {
		Human michael = new Human();
		Human joseph = new Human();
		Ninja hanzo = new Ninja();
		Ninja kiyoko = new Ninja();
		Samurai sarae = new Samurai();
		Samurai senichi = new Samurai();
		Wizard harry = new Wizard();
		Wizard lavender = new Wizard();
		
		lavender.fireball(kiyoko);
		kiyoko.steal(michael);
		michael.attack(kiyoko);
		kiyoko.runAway();
		senichi.deathBlow(harry);
		lavender.heal(harry);
		harry.heal(harry);
		harry.heal(michael);
		lavender.fireball(kiyoko);
		lavender.fireball(kiyoko);
		lavender.fireball(kiyoko);
		harry.fireball(kiyoko);
		harry.fireball(sarae);
		senichi.howMany();
		hanzo.steal(sarae);
		sarae.meditate();
		hanzo.runAway();
		hanzo.runAway();
		hanzo.runAway();
		
		michael.displayHealth();
		joseph.displayHealth();
		hanzo.displayHealth();
		kiyoko.displayHealth();
		sarae.displayHealth();
		senichi.displayHealth();
		harry.displayHealth();
		lavender.displayHealth();
		
		
	}
}
