package ch16_1;

public class Player {
	
	private PlayerLevel level;
	
	Player(){
		level = new BeginnerLevel();
		
	}
	
	public PlayerLevel getLevel() {
		return level;
		
	}
	
	void upgradeLevel(PlayerLevel level) {
		this.level = level;
		
	}
	
	void play(int count) {
		level.go(count);
		
	}
	
	
	
}
