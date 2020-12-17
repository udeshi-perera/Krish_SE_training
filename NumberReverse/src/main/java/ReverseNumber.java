import java.util.Scanner;

public class ReverseNumber {

    //to reverse the given number
    public static void reverse(BigInteger number) {

        //BigInteger reverseNumber= new BigInteger(number);
        BigInteger calculationNumber = new BigInteger("10");


        if (number.compareTo(calculationNumber) == -1) {
            System.out.print((number));
            return;
        } else {
            System.out.print(number.mod(calculationNumber));
            number = number.divide(calculationNumber);
            //recursively calling the reverse method
            reverse(number);
        }
    }

    public static void main(String args[]) {

        System.out.println("Enter a number to reverse ");
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        System.out.println("The reversed number is ");
        BigInteger userInput = new BigInteger(number);
        reverse(userInput);
    }
}
