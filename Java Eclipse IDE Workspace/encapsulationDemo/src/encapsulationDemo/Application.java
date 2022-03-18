package encapsulationDemo;

public class Application {

	public static void main(String[] args) {
//		Player player = new Player();
//		player.name = "Cuong";
//		player.health = 20;
//		player.weapon = "Sword";
//		
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//		
//		damage = 11;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
		
		EnchancedPlayer player = new EnchancedPlayer("Ana", 200, "Sword");
		System.out.println("Initial health is " + player.getHealth());
	}

}
