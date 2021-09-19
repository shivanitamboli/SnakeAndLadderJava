package com.bridgelabzsnakeladder;

public class SnakeAndLadder {

	final static int WIN_POSITION = 100;
    //variable
    static int position =0; //initialize position
    static int getPosition = 0;
    static int numberOfDiceRoll = 0;

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
        * adding while loop to check win position
        * in case the player position go above 100 , the player stay
        * in the same previous position till the player gets the exact
        * number than ads to 100
        * Report the number of times the dice was played to win the game and also the position
        * after every die role
         */
        while (position < WIN_POSITION ){
            int dice = rollDice();
            numberOfDiceRoll++;
            int option = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println("Player Roll Option is : " + option);
            System.out.println("0.no Player 1. Ladder 2.Snake");
            switch(option){
                case 0:
                    System.out.println("no Player is on " +position);
                    break;
                case 1:
                    if ((position + dice) > WIN_POSITION){
                        position = WIN_POSITION;
                    }else{
                        position +=dice;
                    }
                    System.out.println("Ladder is on " +position+" position");
                    break;
                case 2:
                    position-=dice;
                    if ((position -dice) < getPosition){
                        position = getPosition;
                    }
                    System.out.println("Snake is on " +position+ " position");
                    break;
                default:
                    System.out.println("system error");
            }
        }
        System.out.println("Winning position : " +position);
        System.out.println("Count Number of Time Dice Roll TO win :" +numberOfDiceRoll);
    }

}
