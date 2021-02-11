public class SnakeAndLadder {

    public static void main(String[] args) {
        final int snake = 2;
        final int ladder = 1;

        int count1 = 0;
        int count2 = 0;
        int position = 0;
        int position1 = 0;


        outer: while (true) {

            while (position <= 100) {

                double option = Math.floor(Math.random() * 10) % 3;
                double diceNo = (Math.floor(Math.random() * 10) % 6) + 1;

                if ((int) option == ladder) {

                    if (position + (int) diceNo == 100) {
                        final int end = position + (int) diceNo;
                        System.out.println("Player1 Got The Ladder with " + (int) diceNo + " and move to: " + end);
                        System.out.println("**HURRREYY PLAYER1 WIN THE GAME**");
                        break outer;
                    } else if (position + (int) diceNo > 100) {
                        position = position - (int) diceNo;
                    } else if (position + (int) diceNo < 100) {
                        position = position + (int) diceNo;
                        System.out.println("player1 Got The Ladder with " + (int) diceNo + " and move to: " + position);
                    }
                } else if ((int) option == snake) {

                    if (position >= 0) {
                        position = position - (int) diceNo;
                        System.out.println("Player1 Got The Snake with " + (int) diceNo + " And Move To: " + position);
                    } else {
                        System.out.println("player1 at ZERO TRY AGAIN");
                        position = 0;
                    }
                    break;
                } else {
                    System.out.println("Player1 is Not Playing Stay at Same Position: " + position);
                    break;
                }
                System.out.println("Player1 Current Position Is " + position);
                count1++;
            }
            while (position1 <= 100) {

                double option = Math.floor(Math.random() * 10) % 3;
                double diceNo = (Math.floor(Math.random() * 10) % 6) + 1;

                if ((int) option == ladder) {

                    if (position1 + (int) diceNo == 100) {
                        final int end1 = position1 + (int) diceNo;
                        System.out.println("Player2 Got The Ladder with " + (int) diceNo + " and move to: " + end1);
                        System.out.println("**HURRREYY PLAYER2 WIN THE GAME**");
                        break outer;
                    } else if (position1 + (int) diceNo > 100) {
                        position = position1 - (int) diceNo;
                    } else if (position1 + (int) diceNo < 100) {
                        position1 = position1 + (int) diceNo;
                        System.out.println("player2 Got The Ladder with " + (int) diceNo + " and move to: " + position1);
                    }
                } else if ((int) option == snake) {

                    if (position1 >= 0) {
                        position1 = position1 - (int) diceNo;
                        System.out.println("Player2 Got The Snake with " + (int) diceNo + " And Move To: " + position1);
                    } else {
                        System.out.println("player2 at ZERO TRY AGAIN");
                        position1 = 0;
                    }
                    break;
                } else {
                    System.out.println("Player2 is Not Playing Stay at Same Position: " + position1);
                    break;
                }
                System.out.println("Player2 Current Position Is " + position1);
                count2++;
            }
        }
            System.out.println("Number Of Times The Dice Was Rolled By Player1: " + count1);
            System.out.println("Number Of Times The Dice Was Rolled By Player2: " + count2);

    }
}
