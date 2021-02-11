
public class SnakeAndLadder {

    public static void main(String[] args) {

        int position = 0;
        final int snake = 2;
        final int ladder = 1;

        double option = Math.floor(Math.random() * 10) % 3;
        double diceNo = (Math.floor(Math.random() * 10) % 6)+1;


        switch((int)option){
            case ladder:
                position = position+(int)diceNo;
                System.out.println("player Got The Ladder and move to: "+position);
                break;

            case snake:
                if (position==0){
                    System.out.println("player at ZERO TRY AGAIN");
                    break;
                }
                else {
                    position = position - (int) diceNo;
                    System.out.println("Player Got The Snake And Move To: "+ position);
                }
                break;
            default:
                System.out.println("Player is Not Playing Stay at Same Position: "+position);
        }
    }
}
