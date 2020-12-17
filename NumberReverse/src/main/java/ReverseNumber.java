import java.util.Scanner;

public class ReversedNumber {

    //to reverse the given number
    public static void reverseNumber(BigInteger number) {

        BigInteger calculationNumber = new BigInteger("10");



        if (number.compareTo(calculationNumber) == -1) {
            System.out.print((number));
        } else {
            System.out.print(number.mod(calculationNumber));
            number = number.divide(calculationNumber);
            //recursively calling the reverse method
            reverseNumber(number);
        }
    }

    public static void main(String args[]) {

        System.out.println("Enter a number to reverse ");
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        System.out.println("The reversed number is ");
        BigInteger userInput = new BigInteger(number);
        reverseNumber(userInput);
    }
}
