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


        //A "while" function to check if there were numbers in the name (didnt work)//
        /*
        System.out.println("NOTE: If you want to restart type the word exit and press enter\n");
        String firstnameInput = "";
        String exit = "exit";
        boolean nonWordString = true; //if there is a number or figure in the string

        while(true){
            firstnameInput = scanner.nextLine();

            //This will check if there are any digits in the string
            nonWordString = firstnameInput.charAt((int)Math.floor())");

            if(nonWordString == false)
            {
                System.out.println("You have entered a number in your name");
                System.out.println("Remove all numbers from your name and try again");
                continue;
            }else{
                System.out.println("youve won");
            }
        }

         */

        //Scans for the following text that preferably would be a firstname
        String firstname = scanner.nextLine();

        do {
            if (!firstname.matches("[0-9]+]")) {
                okay = false;
                String error = scanner.next();
                System.err.println(error + " is an invalid name");

            } else {
                okay = true;


            }
        }while (!okay);
        System.out.println("you win");



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

        //An attempt to make a random word generator (didnt work)//
        /*
        //Random word generator that didnt work (it ended up printing out "sainNlsNMss"
        int randomPositionOfLetter;
        for (int i=1;i<=fullName.length();i++) {
            randomPositionOfLetter = random.nextInt(fullName.length());
           noSpace = noSpace + fullName.charAt(randomPositionOfLetter);
        }
         */

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
        System.out.printf("- " + "%,5f", bitCoin);
        System.out.printf("\n- " + "%.5f", ethereum);
        System.out.printf("\n- " + "%.5f", cardano);
        System.out.printf("\n- " + "%.5f", binanceCoin);
        System.out.println("In total that is " + (bitCoin + ethereum + cardano + binanceCoin) + " dollars in total and " + ((bitCoin + ethereum + cardano + binanceCoin)/4) + average);












    }
}
