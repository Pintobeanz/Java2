package sheridan;

import java.util.Scanner;

public class Bottles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter number of bottles on the wall");
        int a = input.nextInt();

        for (int i = a; i > 2; i--) {
            System.out.println(i + "bottles of beer on the wall," + i + " bottles of beer.\n" +
                    "Take one down and pass it around," + (i - 1) + " bottles of beer on the wall.");
        }
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.");
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.");
        System.out.println("No more bottles of beer on the wall, no more bottles of beer. \n" +
                "Go to the store and buy some more," + a + " bottles of beer on the wall.");
    }
}
