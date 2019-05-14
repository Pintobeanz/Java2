package sheridan;

import java.util.Scanner;

public class Keyboard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int keyWord;
        System.out.println("please enter a number between 1-9");
        keyWord = input.nextInt();

        while (keyWord != 0) {
            try {
                switch (keyWord) {

                    case 2:
                        System.out.println("move down");
                        break;

                    case 4:
                        System.out.println("move left");
                        break;

                    case 8:
                        System.out.println("move up");
                        break;

                    case 6:
                        System.out.println("move right");
                        break;

                    case 1:
                    case 3:
                    case 7:
                    case 9:
                        System.out.println(" Diagonal moves are not allowed");
                        break;

                    default:
                        System.out.println("Invalid Key");
                        break;
                }
            }catch(Exception e){
                System.out.println("bad Input");
            }
            System.out.println("please enter a number between 1-9");
            keyWord = input.nextInt();
            }
        }
    }

