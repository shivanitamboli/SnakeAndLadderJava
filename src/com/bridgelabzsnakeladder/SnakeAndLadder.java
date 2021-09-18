package com.bridgelabzsnakeladder;

public class SnakeAndLadder {

	static int position =0; //initialize position

    public static void main(String[] args) {
        SnakeAndLadder snakeLad = new SnakeAndLadder();
        snakeLad.playerOption();
    }

    public static int rollDice() {
        /* Method used Math class
         * to Generating Random number between 1 to 6
         */
        int dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("Dice Roll is : " + dice);
        return dice;
    }
    public static void playerOption(){
        /* Method use :
        * Call rollDice method to update position
        * use Random Math class to generating number between 0 to 2
        * use switch to check player option
         */
        int dice = rollDice();
        int option = (int) (Math.floor(Math.random() * 10) % 3);
        System.out.println("Player Roll Option is : " + option);
        System.out.println("0.no Player 1. Ladder 2.Snake");
        switch(option){
            case 0:
                System.out.println("no Player");
                break;
            case 1:
                System.out.println("Ladder");
                position+= dice;
                break;
            case 2:
                System.out.println("Snake");
                position-=dice;
                break;
            default:
                System.out.println("system error");
        }	}

}
