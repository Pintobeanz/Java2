package sheridan;

import java.util.Scanner;

public class Tip {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter amount of bill:");
        double amount= input.nextDouble();


        System.out.println("Please enter tip:");
        int tipamount =input.nextInt();

        double tip= amount*tipamount/100;

        double total= amount+tip;

        System.out.println("The amount of the bill is:"+amount);
        System.out.println("The Tip amount is:"+tipamount+"%");
        System.out.println("The Total of Today's Bill is:"+total);
    }
}
