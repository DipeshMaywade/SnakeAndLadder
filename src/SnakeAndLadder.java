public class SnakeAndLadder {

    public static void main(String[] args) {
        //constant
        final int snake = 2;
        final int ladder = 1;
        //variables
        int count1 = 0;
        int count2 = 0;
        int player1Position = 0;
        int player2Position = 0;

        //This Loop break When Any Player Will Win The Game
        outer: while (true) {

            //Loop For Player1
            while (player1Position <= 100) {

                int option = (int)Math.floor(Math.random() * 10) % 3;
                int diceNo = (int)(Math.floor(Math.random() * 10) % 6) + 1;

                //For Ladder
                if (option == ladder) {

                    if (player1Position + diceNo == 100) {
                        int winningPoint = player1Position + diceNo;
                        System.out.println("Player1 Got The Ladder with " + diceNo + " and move to: " + winningPoint);
                        System.out.println("**HURRREYY PLAYER1 WIN THE GAME**");
                        break outer;
                    }
                    else if (player1Position + diceNo > 100) {
                        player1Position = player1Position - diceNo;
                        break;
                    }
                    else if (player1Position + diceNo < 100) {
                        player1Position = player1Position + diceNo;
                        System.out.println("player1 Got The Ladder with " + diceNo + " and move to: " + player1Position);
                    }
                }

                //For Snake
                else if (option == snake) {

                    if (player1Position >= 0) {
                        player1Position = player1Position - diceNo;
                        System.out.println("Player1 Got The Snake with " + diceNo + " And Move To: " + player1Position);
                    } else {
                        System.out.println("player1 at ZERO TRY AGAIN");
                        player1Position = 0;
                    }
                    break;
                }
                //For No Play
                else {
                    System.out.println("Player1 is Not Playing Stay at Same Position: " + player1Position);
                    break;
                }
                System.out.println("Player1 Current Position Is " + player1Position);
                count1++;
            }

            //Loop For Player2
            while (player2Position <= 100) {

                int option = (int)Math.floor(Math.random() * 10) % 3;
                int diceNo = (int)(Math.floor(Math.random() * 10) % 6) + 1;

                //For Ladder
                if (option == ladder) {

                    if (player2Position + diceNo == 100) {
                        int winningPoint = player2Position + diceNo;
                        System.out.println("Player2 Got The Ladder with " + diceNo + " and move to: " + winningPoint);
                        System.out.println("**HURRREYY PLAYER2 WIN THE GAME**");
                        break outer;
                    } else if (player2Position + diceNo > 100) {
                        player1Position = player2Position - diceNo;
                        break;
                    } else if (player2Position + diceNo < 100) {
                        player2Position = player2Position + diceNo;
                        System.out.println("player2 Got The Ladder with " + diceNo + " and move to: " + player2Position);
                    }
                }

                //For Snake
                else if (option == snake){

                    if (player2Position >= 0) {
                        player2Position = player2Position - diceNo;
                        System.out.println("Player2 Got The Snake with " + diceNo + " And Move To: " + player2Position);
                    } else {
                        System.out.println("player2 at ZERO TRY AGAIN");
                        player2Position = 0;
                    }
                    break;
                }

                //For No Play
                else {
                    System.out.println("Player2 is Not Playing Stay at Same Position: " + player2Position);
                    break;
                }
                System.out.println("Player2 Current Position Is " + player2Position);
                count2++;
            }
        }
            System.out.println("Number Of Times The Dice Was Rolled By Player1: " + count1);
            System.out.println("Number Of Times The Dice Was Rolled By Player2: " + count2);
    }
}
