import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number: ");
        int number = scanner.nextInt();
        String readNumber = "";

        switch (number) {
            case 0:
                readNumber = "Zero";
                break;
            case 1:
                readNumber = "One";
                break;
            case 2:
                readNumber = "Two";
                break;
            case 3:
                readNumber = "Three";
                break;
            case 4:
                readNumber = "Four";
                break;
            case 5:
                readNumber = "Five";
                break;
            case 6:
                readNumber = "Six";
                break;
            case 7:
                readNumber = "Seven";
                break;
            case 8:
                readNumber = "Eight";
                break;
            case 9:
                readNumber = "Night";
                break;
                default:
                    System.out.println("Out of ability");

        }

        System.out.println("Number " + number + " read is " + readNumber);


    }
}
