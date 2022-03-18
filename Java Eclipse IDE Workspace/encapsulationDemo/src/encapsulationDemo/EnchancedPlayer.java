package encapsulationDemo;

public class EnchancedPlayer {
	private String fullName;
	private int hitPoint = 100;
	private String weapon;
	
	public EnchancedPlayer(String name, int health, String weapon) {
		this.fullName = name;
		if(health > 0 && health <= 100) {
			this.hitPoint = health;
		}
		this.weapon = weapon;
	}
	
	public void loseHealth(int damage) {
		this.hitPoint = this.hitPoint - damage;
		if(this.hitPoint <= 0) {
			System.out.println("Player knocked out");
			// Reduce number of lives remaining
		}
	}

	public int getHealth() {
		return hitPoint;
	}
	
	
}
