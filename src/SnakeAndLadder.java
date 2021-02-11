
public class SnakeAndLadder {

    public static void main(String[] args) {

        int position = 0;
        final int snake = 2;
        final int ladder = 1;

        while (position<=100) {
            double option = Math.floor(Math.random() * 10) % 3;
            double diceNo = (Math.floor(Math.random() * 10) % 6) + 1;


            switch ((int) option) {
                case ladder:
                    position = position + (int)diceNo;
                    System.out.println("player Got The Ladder with "+(int)diceNo+" and move to: " + position);
                    break;

                case snake:
                    if (position >= 0) {
                        position = position - (int) diceNo;
                        System.out.println("Player Got The Snake with "+(int)diceNo+" And Move To: " + position);

                    } else {
                        System.out.println("player at ZERO TRY AGAIN");
                        position=0;
                    }

                    break;
                default:
                    System.out.println("Player is Not Playing Stay at Same Position: " + position);


            }

        }

    }
}
