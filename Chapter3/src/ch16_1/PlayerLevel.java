package ch16_1;

public abstract class PlayerLevel {

	protected abstract void run();
	abstract void jump();
	abstract void turn();
	abstract void showLevelMessage();
	
	void go(int steps) {
		showLevelMessage();
		run();
		for(int i = 0; i < steps; i++) {
			jump();
		}
		turn();
	}
	
	
}
