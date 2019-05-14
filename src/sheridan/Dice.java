package sheridan;

import java.util.Random;

public class Dice {

    private Random rand = new Random();

    private int roll() {
        int randValue = rand.nextInt(6) + 1;
        return randValue;
        //return (int) (Math.random() * 6) + 1;

    }

    public static void main(String[] args) {

        //declarations
        Dice self = new Dice();
        int randNo = 0;
        double sum = 0.0;

        //generating/printing random numbers
        for (int i = 0; i < 20; i++) {
            randNo = self.roll();
            sum += randNo;
            System.out.println("Randomno.is" + randNo);
        }

        //Average random
        System.out.println("Average random no.is" + sum / 20);
    }
}
