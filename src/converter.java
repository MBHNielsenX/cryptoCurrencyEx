import java.util.Scanner;
import java.util.Random;

public class converter {
    public static void main(String[] args) {

        //Makes a random generator
        Random random = new Random();
        //Inputs a scanner that allows the system to scan
        Scanner scanner = new Scanner(System.in);
        //A boolean that will confirm the "while" functions later
        boolean okay;
        //Prints the following question
        System.out.println("What is your firstname?");
        String firstname = scanner.nextLine();


        //Prints the following question
        System.out.println("What is your surname?");
        //Scans for the following text that preferably would be a surname
        String surname = scanner.nextLine();


        //Respectively makes a string with and without a space
        String randomChar = "";
        String noSpace = "";
        String space = " ";
        //Replaces all spaces with no spaces
        String fullName = (firstname + surname).replaceAll(space, noSpace);
        //Takes the string "randomChar" and converts the data imported from "fullName" to a random number that then gets converted back to a char
        randomChar += fullName.charAt((int)Math.floor(Math.random() * fullName.length()));


        //Prints the following
        System.out.println("Welcome dear " + firstname + " " + surname + " ❤");
        System.out.println("Here is a random character in your full name: " + randomChar);
        System.out.println("Anyways we hope you're ready to convert some dollars");
        System.out.println("How many dollars will you be converting today?");


        //Scans the input of dollars to see if there is text in it. Loops if theres text
        do {
            if (scanner.hasNextDouble())    {
                okay = true;
            } else {
                okay = false;
                String error = scanner.next();
                System.err.println(error + " is not a number");
            }
        } while (!okay);
        int dollarsAmount = scanner.nextInt();

        //if else statements that will print out a different answer to the amount of money that was input
        if (dollarsAmount < 10) {
            System.out.println(dollarsAmount + " dollars why not more?");

        }
        else if (dollarsAmount < 40) {
            System.out.println(dollarsAmount + " dollars, well done");

        }
        else if (dollarsAmount > 40) {
            System.out.println(dollarsAmount + " Wauv " + dollarsAmount + " dollars that's a lot ✌");

        }


        System.out.println("Here is what you can get with " + dollarsAmount + " dollars");

        //Coin converter
        //47.291,00 == 0,000020
        double bitCoin = dollarsAmount * 0.000020;
        //3.519,33 == 0,00027
        double ethereum = dollarsAmount * 0.00027;
        //2,79 == 0,36
        double cardano = dollarsAmount * 0.36;
        //468,83 == 0,0020
        double binanceCoin = dollarsAmount * 0.0020;
        String average = " dollars in average";

        //Prints out the list of coins in the dollar amount chosen
        System.out.printf("- " + "%.5f", bitCoin);
        System.out.printf("\n- " + "%.5f", ethereum);
        System.out.printf("\n- " + "%.5f", cardano);
        System.out.printf("\n- " + "%.5f", binanceCoin);
        System.out.println("\n" + " In total that is " + (bitCoin + ethereum + cardano + binanceCoin) + " coins and " + ((bitCoin + ethereum + cardano + binanceCoin)/4) + average);












    }
}
