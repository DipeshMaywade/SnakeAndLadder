public class SnakeAndLadder {

    public static void main(String[] args) {
        final int snake = 2;
        final int ladder = 1;
        int count = 0;
        int position = 0;


        while (position<=100) {

            double option = Math.floor(Math.random() * 10) % 3;
            double diceNo = (Math.floor(Math.random() * 10) % 6) + 1;

                if ((int)option==ladder) {

                    if (position + (int) diceNo == 100) {
                        final int end = position+(int)diceNo;
                        System.out.println("Player Got The Ladder with " + (int)diceNo + " and move to: " + end);
                        System.out.println("**HURRREYY U WIN THE GAME**");
                        break;
                    }

                    else if (position + (int)diceNo > 100) {
                        position = position - (int)diceNo;
                    }

                    else if (position + (int)diceNo < 100) {
                        position = position + (int)diceNo;
                        System.out.println("player Got The Ladder with " + (int)diceNo + " and move to: " + position);
                    }
                }

                else if ((int)option==snake) {

                    if (position >= 0) {
                        position = position - (int)diceNo;
                        System.out.println("Player Got The Snake with " + (int)diceNo + " And Move To: " + position);
                    }

                    else {
                        System.out.println("player at ZERO TRY AGAIN");
                        position = 0;
                    }
                }

                else {
                    System.out.println("Player is Not Playing Stay at Same Position: " + position);
                }
            System.out.println("Player Current Position Is " +position );
            count++;
        }
        System.out.println("Number Of Times The Dice Was Roll: "+count);
    }

}
