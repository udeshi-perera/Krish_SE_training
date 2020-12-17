import java.util.Scanner;

public class ReverseNumber {

    //to reverse the given number
    public static void reverse(BigInteger number) {

        BigInteger reverseNumber = new BigInteger(String.valueOf(number));
        BigInteger calculationNumber = new BigInteger("10");


        if (reverseNumber.compareTo(calculationNumber) == -1) {
            System.out.print((reverseNumber));
            return;
        } else {
            System.out.print(reverseNumber.mod(calculationNumber));
            reverseNumber = reverseNumber.divide(calculationNumber);
            //recursively calling the reverse method
            reverse(reverseNumber);
        }
    }

    public static void main(String args[]) {

        System.out.println("Enter a number to reverse ");
        Scanner scanner = new Scanner(System.in);

        BigInteger number = scanner.nextBigInteger();
        System.out.println("The reversed number is ");
        reverse(number);
    }
}
