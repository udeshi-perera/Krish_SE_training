import java.util.Scanner;

public class NumberReverse {

    public static void reverse(int number){
        if(number<10){
            System.out.print((number));
            return;
        }
        else{
            System.out.print((number%10));
            number=number/10;
            reverse(number);
        }
    }

    public static void main(String args[]){

        System.out.println("Enter a number to reverse ");
        Scanner scanner=new Scanner(System.in);

        int number=scanner.nextInt();
        System.out.println("The reversed number is ");
        reverse(number);
    }
}
