package com.bridgelabzsnakeladder;

public class SnakeAndLadder {

	int position =0; //initialize position

    public static void main(String[] args) {
        SnakeAndLadder snakeLad = new SnakeAndLadder();
        int diceValue = snakeLad.rollDice(); // call method her and store method return value
        System.out.println(+diceValue);
    }

    public int rollDice() {
        /* Method used Math class
         * to Generating Random number between 1 to 6
         */
        int dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("Dice Roll is : " + dice);
        return dice;	}

}
