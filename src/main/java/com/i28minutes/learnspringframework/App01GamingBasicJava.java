package com.i28minutes.learnspringframework;

import com.i28minutes.learnspringframework.game.*;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game = new MarioGame() ;
		//var game = new superContraGame() ;
		var game = new PacmanGame() ;
		var gameRunner = new GameRunner(game) ;
		gameRunner.run() ;

	}

}
