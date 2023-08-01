package mx.com.itbrain.learnspringframework;

import mx.com.itbrain.learnspringframework.game.GameRunner;
//import mx.com.itbrain.learnspringframework.game.MarioGame;
//import mx.com.itbrain.learnspringframework.game.SuperContraGame;
import mx.com.itbrain.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game = new MarioGame();
		// var game = new SuperContraGame();
		var game = new PacmanGame();  // 1: Object Creation
		var  gameRunner = new GameRunner(game); 
		    // 2: Object Creation + Wiring of Dependencies
		    // Game is a Dependency
		gameRunner.run();
	}
}
